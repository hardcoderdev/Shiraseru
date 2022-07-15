package hardcoder.dev.shiraseru_snackbars_built_in

import android.graphics.Typeface
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import com.google.android.material.snackbar.Snackbar
import hardcoder.dev.shiraseru_core.extensions.receiveDrawable
import hardcoder.dev.shiraseru_core.mappers.IconGravity
import hardcoder.dev.shiraseru_resources.R
import hardcoder.dev.shiraseru_snackbars_built_in.config.BuiltInSnackerConfig
import hardcoder.dev.shiraseru_snackbars_built_in.config.BuiltInSnackerState
import hardcoder.dev.shiraseru_snackbars_built_in.message.MessageAppearance
import hardcoder.dev.shiraseru_snackbars_core.databinding.SnackerLayoutBinding

class BuiltInSnacker(private val view: View) {

    private var _binding: SnackerLayoutBinding? = null
    private val binding by lazy { requireNotNull(_binding) }
    private var _snackerConfig: BuiltInSnackerConfig? = null
    private val snackerConfig: BuiltInSnackerConfig get() = requireNotNull(_snackerConfig)

    init {
        _binding = SnackerLayoutBinding.inflate(LayoutInflater.from(view.context))
    }

    fun setConfig(builtInSnackerConfig: BuiltInSnackerConfig) = with(builtInSnackerConfig) {
        _snackerConfig = BuiltInSnackerConfig(
            state,
            showDuration,
            iconTint,
            iconPadding,
            messageTextColor,
            actionTextColor,
            iconGravity,
            isNeedToShowIcon,
            isNeedToShowAction,
            isFloating
        )
    }

    fun explode(msg: String, actionMsg: String, action: () -> Unit) = with(binding) {
        val messageAppearance = setUpMessageAppearance()
        val textColor = snackerConfig.messageTextColor.value
        val backgroundShape = view.context.receiveDrawable(messageAppearance.backgroundResourceId)

        val snackbar = Snackbar.make(view, msg, snackerConfig.showDuration.value)
        val snackbarLayout = (snackbar.view as ViewGroup)

        if (snackerConfig.isFloating.value) {
            val marginParams = snackbarLayout.layoutParams as ViewGroup.MarginLayoutParams
            marginParams.apply {
                bottomMargin = 64
                leftMargin = 64
                rightMargin = 64
            }.also { marginLayoutParams ->
                snackbarLayout.layoutParams = marginLayoutParams
            }
        }

        snackbarLayout.apply {
            removeAllViews()
            addView(binding.root)
            setPadding(0, 0, 0, 0)
            background = backgroundShape
            elevation = 0f
        }

        if (snackerConfig.isNeedToShowAction.value) {
            actionTextView.apply {
                text = actionMsg
                typeface = Typeface.DEFAULT
                textSize = 16f
                setTextColor(textColor)
                setOnClickListener {
                    action.invoke()
                    snackbar.dismiss()
                }
            }
        }

        if (snackerConfig.isNeedToShowIcon.value) {
            val iconDrawable = view.context.receiveDrawable(messageAppearance.iconResourceId)
            val iconColor = snackerConfig.iconTint
            iconDrawable?.setTint(iconColor.value)
            when (snackerConfig.iconGravity) {
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

        extraPictureImageView.isVisible = false
        delimiterView.isVisible = false

        messageTextView.apply {
            text = msg
            typeface = Typeface.DEFAULT_BOLD
            textSize = 18F
            setTextColor(snackerConfig.messageTextColor.value)
            if (snackerConfig.isNeedToShowIcon.value) compoundDrawablePadding = 16
        }

        actionTextView.apply {
            text = actionMsg
            typeface = Typeface.MONOSPACE
            textSize = 16F
            setTextColor(snackerConfig.actionTextColor.value)
            setOnClickListener {
                action.invoke()
                snackbar.dismiss()
            }
        }

        snackbar.show()
    }

    private fun setUpMessageAppearance(): MessageAppearance {
        if (snackerConfig.isFloating.value) {
            return when (snackerConfig.state) {
                BuiltInSnackerState.WARNING -> MessageAppearance(
                    R.drawable.warning_shape_rounded,
                    R.drawable.ic_warning
                )
                BuiltInSnackerState.ERROR -> MessageAppearance(
                    R.drawable.error_shape_rounded,
                    R.drawable.ic_error
                )
                BuiltInSnackerState.SUCCESS -> MessageAppearance(
                    R.drawable.success_shape_rounded,
                    R.drawable.ic_success
                )
                BuiltInSnackerState.INFO -> MessageAppearance(
                    R.drawable.info_shape_rounded,
                    R.drawable.ic_info
                )
            }
        } else {
            return when (snackerConfig.state) {
                BuiltInSnackerState.WARNING -> MessageAppearance(
                    R.drawable.warning_shape,
                    R.drawable.ic_warning
                )
                BuiltInSnackerState.ERROR -> MessageAppearance(
                    R.drawable.error_shape,
                    R.drawable.ic_error
                )
                BuiltInSnackerState.SUCCESS -> MessageAppearance(
                    R.drawable.success_shape,
                    R.drawable.ic_success
                )
                BuiltInSnackerState.INFO -> MessageAppearance(
                    R.drawable.info_shape,
                    R.drawable.ic_info
                )
            }
        }
    }
}