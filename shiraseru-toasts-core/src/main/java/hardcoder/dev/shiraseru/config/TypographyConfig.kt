package hardcoder.dev.shiraseru.config

import android.graphics.Typeface
import androidx.annotation.ColorRes
import hardcoder.dev.shiraseru_resources.R
import hardcoder.dev.shiraseru_core.mappers.ToasterGravity

data class TypographyConfig(
    val textGravity: ToasterGravity = ToasterGravity.CENTER,
    val textColor: TextColor = TextColor(R.color.white),
    val typeface: Typeface = Typeface.DEFAULT,
    val textSize: TextSize = TextSize(R.dimen.default_message_text_size)
)

data class TextSize(val value: Int)

data class TextColor(val value: Int)
