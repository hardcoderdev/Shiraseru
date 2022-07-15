package hardcoder.dev.shiraseru_snackbars_core.config

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.annotation.DrawableRes

data class ExtraImageConfig(
    val image: ExtraImage = ExtraImage(null),
    val scaleType: ImageView.ScaleType = ImageView.ScaleType.CENTER
)

data class ExtraImage(val value: Drawable?)