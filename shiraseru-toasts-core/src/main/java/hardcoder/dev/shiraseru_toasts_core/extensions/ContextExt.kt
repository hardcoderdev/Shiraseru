package hardcoder.dev.shiraseru_toasts_core.extensions

import android.content.Context
import hardcoder.dev.shiraseru_toasts_core.Toaster
import hardcoder.dev.shiraseru_toasts_core.config.ToasterConfig

fun Context.toaster(config: ToasterConfig, message: String) {
    Toaster(this).apply {
        setConfig(config)
        explode(message)
    }
}