package hardcoder.dev.shiraseru_toasts_core.config

import android.graphics.Color
import android.graphics.Typeface
import hardcoder.dev.shiraseru_core.mappers.ToasterGravity

data class TypographyConfig(
    val textGravity: ToasterGravity = ToasterGravity.CENTER,
    val textColor: TextColor = TextColor(Color.WHITE),
    val typeface: Typeface = Typeface.DEFAULT,
    val textSize: TextSize = TextSize(16)
)

data class TextSize(val value: Int)

data class TextColor(val value: Int)
