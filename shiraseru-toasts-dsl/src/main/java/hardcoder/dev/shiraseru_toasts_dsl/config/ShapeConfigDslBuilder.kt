package hardcoder.dev.shiraseru_toasts_dsl.config

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.core.content.res.ResourcesCompat
import hardcoder.dev.shiraseru.config.Background
import hardcoder.dev.shiraseru.config.BackgroundTint
import hardcoder.dev.shiraseru.config.ShapeConfig
import hardcoder.dev.shiraseru_resources.R

class ShapeConfigDslBuilder(private val context: Context) {

    var background: Background = Background(null)
    var tint: BackgroundTint = BackgroundTint(R.color.white)

    infix fun Background.byValue(value: Drawable) {
        background = Background(value)
    }

    infix fun Background.byResource(@DrawableRes value: Int) {
        background = Background(ResourcesCompat.getDrawable(context.resources, value, context.theme))
    }

    infix fun BackgroundTint.byValue(value: Int) {
        tint = BackgroundTint(value)
    }

    infix fun BackgroundTint.byResource(@ColorRes value: Int) {
        tint = BackgroundTint(ResourcesCompat.getColor(context.resources, value, context.theme))
    }

    fun build() = ShapeConfig(
        background,
        tint
    )
}