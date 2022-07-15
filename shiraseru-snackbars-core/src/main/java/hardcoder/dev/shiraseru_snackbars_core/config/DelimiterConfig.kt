package hardcoder.dev.shiraseru_snackbars_core.config

import android.graphics.Color
import android.graphics.drawable.Drawable

data class DelimiterConfig(
    val color: DelimiterColor = DelimiterColor(Color.WHITE),
    val shape: DelimiterShape = DelimiterShape(null),
    val width: DelimiterWidth = DelimiterWidth(2)
)

data class DelimiterColor(val value: Int)
data class DelimiterShape(val value: Drawable?)
data class DelimiterWidth(val value: Int)
