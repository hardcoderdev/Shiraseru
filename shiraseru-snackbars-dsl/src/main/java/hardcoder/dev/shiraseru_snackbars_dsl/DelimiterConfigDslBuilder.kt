package hardcoder.dev.shiraseru_snackbars_dsl

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import androidx.annotation.ColorRes
import androidx.annotation.DimenRes
import androidx.annotation.DrawableRes
import androidx.core.content.res.ResourcesCompat
import hardcoder.dev.shiraseru_snackbars_core.config.DelimiterColor
import hardcoder.dev.shiraseru_snackbars_core.config.DelimiterConfig
import hardcoder.dev.shiraseru_snackbars_core.config.DelimiterShape
import hardcoder.dev.shiraseru_snackbars_core.config.DelimiterWidth

class DelimiterConfigDslBuilder(private val context: Context) {

    var color: DelimiterColor = DelimiterColor(Color.WHITE)
    var shape: DelimiterShape = DelimiterShape(null)
    var width: DelimiterWidth = DelimiterWidth(2)

    infix fun DelimiterColor.byValue(value: Int) {
        color = DelimiterColor(value)
    }

    infix fun DelimiterColor.byResource(@ColorRes value: Int) {
        color = DelimiterColor(ResourcesCompat.getColor(context.resources, value, context.theme))
    }

    infix fun DelimiterShape.byValue(value: Drawable?) {
        shape = DelimiterShape(value)
    }

    infix fun DelimiterShape.byResource(@DrawableRes value: Int) {
        shape = DelimiterShape(ResourcesCompat.getDrawable(context.resources, value, context.theme))
    }

    infix fun DelimiterWidth.byValue(value: Int) {
        width = DelimiterWidth(value)
    }

    infix fun DelimiterWidth.byResource(@DimenRes value: Int) {
        width = DelimiterWidth(context.resources.getDimension(value).toInt())
    }

    fun build() = DelimiterConfig(color, shape, width)
}
