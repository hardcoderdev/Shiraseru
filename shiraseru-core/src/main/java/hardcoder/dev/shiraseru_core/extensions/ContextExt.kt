package hardcoder.dev.shiraseru_core.extensions

import android.content.Context
import androidx.core.content.res.ResourcesCompat

fun Context.receiveDrawable(resourceId: Int) = ResourcesCompat.getDrawable(
    resources,
    resourceId,
    theme
)
