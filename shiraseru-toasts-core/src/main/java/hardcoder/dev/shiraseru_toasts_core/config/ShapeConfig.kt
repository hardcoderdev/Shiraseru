package hardcoder.dev.shiraseru_toasts_core.config

import android.graphics.Color
import android.graphics.drawable.Drawable

data class ShapeConfig(
    val background: Background = Background(null),
    val tint: BackgroundTint = BackgroundTint(Color.BLACK),
)

data class Background(val value: Drawable?)

data class BackgroundTint(val value: Int)
