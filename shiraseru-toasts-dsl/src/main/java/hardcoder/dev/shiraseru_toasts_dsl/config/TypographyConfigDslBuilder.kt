package hardcoder.dev.shiraseru_toasts_dsl.config

import android.content.Context
import android.graphics.Typeface
import androidx.annotation.ColorRes
import androidx.annotation.DimenRes
import androidx.core.content.res.ResourcesCompat
import hardcoder.dev.shiraseru_toasts_core.config.TextColor
import hardcoder.dev.shiraseru_toasts_core.config.TextSize
import hardcoder.dev.shiraseru_toasts_core.config.TypographyConfig
import hardcoder.dev.shiraseru_core.mappers.ToasterGravity
import hardcoder.dev.shiraseru_resources.R

class TypographyConfigDslBuilder(private val context: Context) {

    var textSize = TextSize(R.dimen.default_message_text_size)
    var textGravity = ToasterGravity.CENTER
    var textColorResourceId = TextColor(R.color.white)
    var typeface: Typeface = Typeface.DEFAULT

    infix fun ToasterGravity.byEnum(value: ToasterGravity) {
        textGravity = value
    }

    infix fun Typeface.byEnum(value: Typeface) {
        typeface = value
    }

    infix fun TextSize.byValue(value: Int) {
        textSize = TextSize(value)
    }

    infix fun TextSize.byResource(@DimenRes value: Int) {
        textSize = TextSize(context.resources.getDimension(value).toInt())
    }

    infix fun TextColor.byValue(value: Int) {
        textColorResourceId = TextColor(value)
    }

    infix fun TextColor.byResource(@ColorRes value: Int) {
        textColorResourceId = TextColor(ResourcesCompat.getColor(context.resources, value, context.theme))
    }

    fun build() = TypographyConfig(textGravity, textColorResourceId, typeface, textSize)
}