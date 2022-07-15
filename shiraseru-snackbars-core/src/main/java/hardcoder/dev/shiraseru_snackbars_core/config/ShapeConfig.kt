package hardcoder.dev.shiraseru_snackbars_core.config

import android.graphics.drawable.Drawable
import hardcoder.dev.shiraseru_resources.R

data class ShapeConfig(
    val background: Background = Background(null),
    val tint: BackgroundTint = BackgroundTint(R.color.black),
)

data class Background(val value: Drawable?)
data class BackgroundTint(val value: Int)