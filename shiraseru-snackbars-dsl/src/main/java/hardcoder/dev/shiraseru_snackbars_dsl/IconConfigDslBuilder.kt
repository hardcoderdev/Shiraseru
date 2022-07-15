package hardcoder.dev.shiraseru_snackbars_dsl

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.annotation.ColorRes
import androidx.annotation.DimenRes
import androidx.annotation.DrawableRes
import androidx.core.content.res.ResourcesCompat
import hardcoder.dev.shiraseru_resources.R
import hardcoder.dev.shiraseru_snackbars_core.config.Icon
import hardcoder.dev.shiraseru_snackbars_core.config.IconConfig
import hardcoder.dev.shiraseru_snackbars_core.config.IconPadding
import hardcoder.dev.shiraseru_snackbars_core.config.IconTint

class IconConfigDslBuilder(private val context: Context) {

    var drawable: Icon = Icon(null)
    var tint: IconTint = IconTint(R.color.white)
    var padding: IconPadding = IconPadding(R.dimen.default_icon_padding)

    infix fun Icon.byValue(value: Drawable?) {
        drawable = Icon(value)
    }

    infix fun Icon.byResource(@DrawableRes value: Int) {
        drawable = Icon(ResourcesCompat.getDrawable(context.resources, value, context.theme))
    }

    infix fun IconTint.byValue(value: Int) {
        tint = IconTint(value)
    }

    infix fun IconTint.byResource(@ColorRes value: Int) {
        tint = IconTint(ResourcesCompat.getColor(context.resources, value, context.theme))
    }

    infix fun IconPadding.byValue(value: Int) {
        padding = IconPadding(value)
    }

    infix fun IconPadding.byResource(@DimenRes value: Int) {
        padding = IconPadding(context.resources.getDimension(value).toInt())
    }

    fun build() = IconConfig(drawable, tint, padding)
}