package hardcoder.dev.shiraseru_snackbars_dsl

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.core.content.res.ResourcesCompat
import hardcoder.dev.shiraseru_resources.R
import hardcoder.dev.shiraseru_snackbars_core.config.Background
import hardcoder.dev.shiraseru_snackbars_core.config.BackgroundTint
import hardcoder.dev.shiraseru_snackbars_core.config.ShapeConfig

class ShapeConfigDslBuilder(private val context: Context) {

    var background: Background = Background(ResourcesCompat.getDrawable(context.resources, R.drawable.shape_empty, context.theme))
    var tint: BackgroundTint = BackgroundTint(Color.BLACK)

    infix fun Background.byValue(value: Drawable?) {
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

    fun build() = ShapeConfig(background, tint)
}