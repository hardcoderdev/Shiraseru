package hardcoder.dev.shiraseru_snackbars_core.extensions

import android.view.View
import hardcoder.dev.shiraseru_snackbars_core.Snacker
import hardcoder.dev.shiraseru_snackbars_core.config.SnackerConfig

fun View.snacker(
    config: SnackerConfig,
    message: String,
    actionMessage: String,
    action: () -> Unit
) {
    Snacker(this).apply {
        setConfig(config)
        explode(message, actionMessage, action)
    }
}