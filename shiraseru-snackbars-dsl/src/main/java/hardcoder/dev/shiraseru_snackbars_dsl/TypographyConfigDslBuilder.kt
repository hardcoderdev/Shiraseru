package hardcoder.dev.shiraseru_snackbars_dsl

import android.content.Context
import android.graphics.Typeface
import androidx.annotation.ColorRes
import androidx.annotation.DimenRes
import androidx.core.content.res.ResourcesCompat
import hardcoder.dev.shiraseru_core.mappers.ToasterGravity
import hardcoder.dev.shiraseru_resources.R
import hardcoder.dev.shiraseru_snackbars_core.config.*

class TypographyConfigDslBuilder(private val context: Context) {

    var messageTextSize = MessageTextSize(R.dimen.default_message_text_size)
    var actionTextSize = ActionTextSize(R.dimen.default_action_message_text_size)
    var textGravity = ToasterGravity.CENTER
    var messageTextColor = MessageTextColor(R.color.white)
    var actionTextColor = ActionTextColor(R.color.white)
    var messageTypeface = MessageTypeface(Typeface.DEFAULT)
    var actionTypeface = ActionTypeface(Typeface.DEFAULT)

    infix fun ToasterGravity.byEnum(value: ToasterGravity) {
        textGravity = value
    }

    infix fun MessageTypeface.byEnum(value: Typeface) {
        messageTypeface = MessageTypeface(value)
    }

    infix fun ActionTypeface.byEnum(value: Typeface) {
        actionTypeface = ActionTypeface(value)
    }

    infix fun MessageTextSize.byValue(value: Int) {
        messageTextSize = MessageTextSize(value)
    }

    infix fun MessageTextSize.byResource(@DimenRes value: Int) {
        messageTextSize = MessageTextSize(context.resources.getDimension(value).toInt())
    }

    infix fun ActionTextSize.byValue(value: Int) {
        actionTextSize = ActionTextSize(value)
    }

    infix fun ActionTextSize.byResource(@DimenRes value: Int) {
        actionTextSize = ActionTextSize(context.resources.getDimension(value).toInt())
    }

    infix fun MessageTextColor.byValue(value: Int) {
        messageTextColor = MessageTextColor(value)
    }

    infix fun MessageTextColor.byResource(@ColorRes value: Int) {
        messageTextColor = MessageTextColor(ResourcesCompat.getColor(context.resources, value, context.theme))
    }

    infix fun ActionTextColor.byValue(value: Int) {
        actionTextColor = ActionTextColor(value)
    }

    infix fun ActionTextColor.byResource(@ColorRes value: Int) {
        actionTextColor = ActionTextColor(ResourcesCompat.getColor(context.resources, value, context.theme))
    }

    fun build() = TypographyConfig(
        textGravity,
        messageTextColor,
        actionTextColor,
        messageTypeface,
        actionTypeface,
        messageTextSize,
        actionTextSize
    )
}