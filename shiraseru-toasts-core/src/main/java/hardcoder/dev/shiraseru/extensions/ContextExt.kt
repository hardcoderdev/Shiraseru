package hardcoder.dev.shiraseru.extensions

import android.content.Context
import hardcoder.dev.shiraseru.Toaster
import hardcoder.dev.shiraseru.config.ToasterConfig

fun Context.toaster(config: ToasterConfig, message: String) {
    Toaster(this).apply {
        setConfig(config)
        explode(message)
    }
}