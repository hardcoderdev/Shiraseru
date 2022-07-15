@file:Suppress("DEPRECATION")

package hardcoder.dev.shiraseru

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.widget.Toast
import hardcoder.dev.shiraseru.config.ToasterConfig
import hardcoder.dev.shiraseru.databinding.ToasterLayoutBinding
import hardcoder.dev.shiraseru_core.mappers.IconGravity
import hardcoder.dev.shiraseru_core.mappers.ToastGravityMapper

class Toaster(private val context: Context) : Toast(context) {

    private var _binding: ToasterLayoutBinding? = null
    private val binding by lazy { requireNotNull(_binding) }
    private var _toasterConfig: ToasterConfig? = null
    private val toasterConfig: ToasterConfig get() = requireNotNull(_toasterConfig)
    private val toastGravityMapper = ToastGravityMapper()

    init {
        _binding = ToasterLayoutBinding.inflate(LayoutInflater.from(context))
    }

    fun setConfig(toasterConfig: ToasterConfig) =
        with(toasterConfig) {
            _toasterConfig = ToasterConfig(
                shapeConfig,
                gravityConfig,
                typographyConfig,
                iconConfig,
                showDuration,
                isNeedToShowIcon,
            )
        }

    fun explode(msg: String) = with(binding) {
        val textColor = toasterConfig.typographyConfig.textColor.value
        val background = toasterConfig.shapeConfig.background.value
        val backgroundColor = toasterConfig.shapeConfig.tint.value

        if (toasterConfig.isNeedToShowIcon) {
            val iconDrawable = toasterConfig.iconConfig.drawable.value
            val iconColor = toasterConfig.iconConfig.tint.value
            iconDrawable?.setTint(iconColor)

            when (toasterConfig.gravityConfig.iconGravity) {
                IconGravity.TOP -> {
                    messageTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(
                        null, iconDrawable, null, null
                    )
                }
                IconGravity.START -> {
                    messageTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(
                        iconDrawable, null, null, null
                    )
                }
                IconGravity.BOTTOM -> {
                    messageTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(
                        null, null, null, iconDrawable
                    )
                }
                IconGravity.END -> {
                    messageTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(
                        null, null, iconDrawable, null
                    )
                }
            }
        }

        messageTextView.apply {
            text = msg
            setTextColor(textColor)
            if (toasterConfig.isNeedToShowIcon) {
                compoundDrawablePadding = toasterConfig.iconConfig.padding.value
            }
        }

        toastStateConstraintLayout.apply {
            background?.setTint(backgroundColor)
            setBackground(background)
        }

        showToast(msg)
    }

    private fun showToast(msg: String) {
        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.R) {
            Toast(context).apply {
                view = binding.root
                duration = toasterConfig.showDuration.value
                setGravity(
                    toastGravityMapper.toGravityValue(toasterConfig.gravityConfig.toasterGravity),
                    toasterConfig.gravityConfig.xOffset.value,
                    toasterConfig.gravityConfig.yOffset.value
                )
            }.show()
        } else {
            makeText(context, msg, toasterConfig.showDuration.value).show()
        }
    }
}