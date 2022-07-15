@file:Suppress("DEPRECATION")

package hardcoder.dev.shiraseru_toasts_built_in

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.widget.Toast
import hardcoder.dev.shiraseru_toasts_core.databinding.ToasterLayoutBinding
import hardcoder.dev.shiraseru_core.extensions.receiveDrawable
import hardcoder.dev.shiraseru_core.mappers.IconGravity
import hardcoder.dev.shiraseru_resources.R
import hardcoder.dev.shiraseru_toasts_built_in.config.BuiltInToasterConfig
import hardcoder.dev.shiraseru_toasts_built_in.config.BuiltInToasterState
import hardcoder.dev.shiraseru_toasts_built_in.message.MessageAppearance

class BuiltInToaster(private val context: Context) : Toast(context) {

    private var _binding: ToasterLayoutBinding? = null
    private val binding by lazy { requireNotNull(_binding) }
    private var _toasterConfig: BuiltInToasterConfig? = null
    private val toasterConfig: BuiltInToasterConfig get() = requireNotNull(_toasterConfig)

    init {
        _binding = ToasterLayoutBinding.inflate(LayoutInflater.from(context))
    }

    fun setConfig(builtInToasterConfig: BuiltInToasterConfig) = with(builtInToasterConfig) {
        _toasterConfig = BuiltInToasterConfig(
            state,
            showDuration,
            iconTint,
            textColor,
            iconGravity,
            isNeedToShowIcon
        )
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    fun explode(msg: String) = with(binding) {
        val messageAppearance = setUpMessageAppearance()
        val textColor = toasterConfig.textColor
        val background = context.receiveDrawable(messageAppearance.backgroundResourceId)

        if (toasterConfig.isNeedToShowIcon.value) {
            val iconDrawable = context.receiveDrawable(messageAppearance.iconResourceId)
            val iconColor = toasterConfig.iconTint
            iconDrawable?.setTint(iconColor.value)

            when (toasterConfig.iconGravity) {
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
            setTextColor(textColor.value)
            if (toasterConfig.isNeedToShowIcon.value) compoundDrawablePadding = 16
        }

        toastStateConstraintLayout.background = background

        showToast(msg)
    }

    private fun showToast(msg: String) {
        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.R) {
            Toast(context).apply {
                view = binding.root
                duration = toasterConfig.showDuration.value
            }.show()
        } else {
            makeText(context, msg, toasterConfig.showDuration.value).show()
        }
    }

    private fun setUpMessageAppearance(): MessageAppearance {
        return when (toasterConfig.state) {
            BuiltInToasterState.WARNING -> MessageAppearance(
                R.drawable.warning_shape_rounded,
                R.drawable.ic_warning
            )
            BuiltInToasterState.ERROR -> MessageAppearance(
                R.drawable.error_shape_rounded,
                R.drawable.ic_error
            )
            BuiltInToasterState.SUCCESS -> MessageAppearance(
                R.drawable.success_shape_rounded,
                R.drawable.ic_success
            )
            BuiltInToasterState.INFO -> MessageAppearance(
                R.drawable.info_shape_rounded,
                R.drawable.ic_info
            )
        }
    }
}