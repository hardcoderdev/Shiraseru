package hardcoder.dev.shiraseru_snackbars_core.config

import android.graphics.Typeface
import hardcoder.dev.shiraseru_core.mappers.ToasterGravity
import hardcoder.dev.shiraseru_resources.R

data class TypographyConfig(
    val messageGravity: ToasterGravity = ToasterGravity.CENTER,
    val messageTextColor: MessageTextColor = MessageTextColor(R.color.white),
    val actionTextColor: ActionTextColor = ActionTextColor(R.color.white),
    val messageTypeface: MessageTypeface = MessageTypeface(Typeface.DEFAULT),
    val actionTypeface: ActionTypeface = ActionTypeface(Typeface.DEFAULT),
    val messageTextSize: MessageTextSize = MessageTextSize(R.dimen.default_message_text_size),
    val actionTextSize: ActionTextSize = ActionTextSize(R.dimen.default_action_message_text_size)
)

data class MessageTextSize(val value: Int)
data class ActionTextSize(val value: Int)

data class MessageTextColor(val value: Int)
data class ActionTextColor(val value: Int)

data class MessageTypeface(val value: Typeface)
data class ActionTypeface(val value: Typeface)
