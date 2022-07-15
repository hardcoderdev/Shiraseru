package hardcoder.dev.shiraseru.config

import android.graphics.drawable.Drawable
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import hardcoder.dev.shiraseru_resources.R

data class ShapeConfig(
    val background: Background = Background(null),
    val tint: BackgroundTint = BackgroundTint(R.color.black),
)

data class Background(val value: Drawable?)

data class BackgroundTint(val value: Int)
