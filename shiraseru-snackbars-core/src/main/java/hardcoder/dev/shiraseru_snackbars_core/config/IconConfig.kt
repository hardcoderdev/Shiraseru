package hardcoder.dev.shiraseru_snackbars_core.config

import android.graphics.drawable.Drawable
import hardcoder.dev.shiraseru_resources.R

data class IconConfig(
    val drawable: Icon = Icon(null),
    val tint: IconTint = IconTint(R.color.white),
    val padding: IconPadding = IconPadding(R.dimen.default_icon_padding)
)

data class Icon(val value: Drawable?)

data class IconTint(val value: Int)

data class IconPadding(val value: Int)
