package hardcoder.dev.shiraseru_snackbars_dsl

import android.content.Context
import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.core.content.res.ResourcesCompat
import hardcoder.dev.shiraseru_snackbars_core.config.ExtraImage
import hardcoder.dev.shiraseru_snackbars_core.config.ExtraImageConfig

class ExtraImageConfigDslBuilder(private val context: Context) {

    var extraImage = ExtraImage(null)
    var scaleType = ImageView.ScaleType.CENTER

    infix fun ExtraImage.byValue(value: Drawable?) {
        extraImage = ExtraImage(value)
    }

    infix fun ExtraImage.byResource(@DrawableRes value: Int) {
        extraImage = ExtraImage(ResourcesCompat.getDrawable(context.resources, value, context.theme))
    }

    infix fun ImageView.ScaleType.byEnum(value: ImageView.ScaleType) {
        scaleType = value
    }

    fun build() = ExtraImageConfig(
        extraImage,
        scaleType
    )
}

