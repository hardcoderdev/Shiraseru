package hardcoder.dev.shiraseru_toasts_core.config

import android.graphics.Color
import android.graphics.drawable.Drawable

data class IconConfig(
    val drawable: Icon = Icon(null),
    val tint: IconTint = IconTint(Color.WHITE),
    val padding: IconPadding = IconPadding(16)
)

data class Icon(val value: Drawable?)

data class IconTint(val value: Int)

data class IconPadding(val value: Int)