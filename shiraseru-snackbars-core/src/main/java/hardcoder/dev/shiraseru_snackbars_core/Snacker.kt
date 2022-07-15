package hardcoder.dev.shiraseru_snackbars_core

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.core.view.marginBottom
import com.google.android.material.snackbar.Snackbar
import hardcoder.dev.shiraseru_core.mappers.IconGravity
import hardcoder.dev.shiraseru_snackbars_core.config.SnackerConfig
import hardcoder.dev.shiraseru_snackbars_core.databinding.SnackerLayoutBinding

class Snacker(private val view: View) {

    private var _binding: SnackerLayoutBinding? = null
    private val binding by lazy { requireNotNull(_binding) }
    private var _snackerConfig: SnackerConfig? = null
    val snackerConfig: SnackerConfig get() = requireNotNull(_snackerConfig)

    init {
        _binding = SnackerLayoutBinding.inflate(LayoutInflater.from(view.context))
    }

    fun setConfig(snackerConfig: SnackerConfig) = with(snackerConfig) {
        _snackerConfig = SnackerConfig(
            delimiterConfig,
            iconConfig,
            gravityConfig,
            typographyConfig,
            extraImageConfig,
            shapeConfig,
            visibilityConfig,
            sizingConfig,
            showDuration
        )
    }

    fun explode(msg: String, actionMsg: String = "", action: () -> Unit) = with(binding) {
        val backgroundShape = snackerConfig.shapeConfig.background.value
        val backgroundTint = snackerConfig.shapeConfig.tint.value
        val messageTextColor = snackerConfig.typographyConfig.messageTextColor.value
        val actionTextColor = snackerConfig.typographyConfig.actionTextColor.value
        val delimiterColor = snackerConfig.delimiterConfig.color.value
        val delimiterShape = snackerConfig.delimiterConfig.shape.value
        val delimiterWidth = snackerConfig.delimiterConfig.width.value

        val snackbar = Snackbar.make(view, msg, snackerConfig.showDuration.value)
        val snackbarLayout = (snackbar.view as ViewGroup)
        val marginParams = snackbarLayout.layoutParams as ViewGroup.MarginLayoutParams
        marginParams.apply {
            bottomMargin = snackerConfig.sizingConfig.marginBottom.value
            leftMargin = snackerConfig.sizingConfig.marginStart.value
            rightMargin = snackerConfig.sizingConfig.marginEnd.value
        }

        backgroundShape?.setTint(backgroundTint)

        snackbarLayout.apply {
            removeAllViews()
            addView(binding.root)
            setPadding(0, 0, 0, 0)
            background = backgroundShape
            background?.setTint(backgroundTint)
            elevation = 0f
            layoutParams = marginParams
        }

        if (snackerConfig.visibilityConfig.isNeedToShowAction.value) {
            actionTextView.apply {
                text = actionMsg
                typeface = snackerConfig.typographyConfig.actionTypeface.value
                textSize = snackerConfig.typographyConfig.actionTextSize.value.toFloat()
                setTextColor(actionTextColor)
                setOnClickListener {
                    action.invoke()
                    snackbar.dismiss()
                }
            }
        }

        if (snackerConfig.visibilityConfig.isNeedToShowIcon.value) {
            val iconDrawable = snackerConfig.iconConfig.drawable.value
            val iconColor = snackerConfig.iconConfig.tint.value
            iconDrawable?.setTint(iconColor)

            when (snackerConfig.gravityConfig.iconGravity) {
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

        if (snackerConfig.visibilityConfig.isNeedToShowExtraPicture.value) {
            extraPictureImageView.apply {
                setImageDrawable(snackerConfig.extraImageConfig.image.value)
                scaleType = snackerConfig.extraImageConfig.scaleType
            }
            extraPictureImageView.isVisible = true
        } else {
            extraPictureImageView.isVisible = false
        }

        if (snackerConfig.visibilityConfig.isNeedToShowDelimiter.value) {
            delimiterView.apply {
                layoutParams.width = delimiterWidth
                delimiterShape?.setTint(delimiterColor)
                background = delimiterShape
            }
        } else {
            delimiterView.isVisible = false
        }

        messageTextView.apply {
            text = msg
            typeface = snackerConfig.typographyConfig.messageTypeface.value
            textSize = snackerConfig.typographyConfig.messageTextSize.value.toFloat()
            setTextColor(messageTextColor)
        }

        snackbar.show()
    }
}