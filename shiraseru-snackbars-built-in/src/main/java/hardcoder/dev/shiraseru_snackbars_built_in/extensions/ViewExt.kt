package hardcoder.dev.shiraseru_snackbars_built_in.extensions

import android.view.View
import hardcoder.dev.shiraseru_snackbars_built_in.BuiltInSnacker
import hardcoder.dev.shiraseru_snackbars_built_in.config.BuiltInSnackerConfig

fun View.builtInSnacker(
    config: BuiltInSnackerConfig,
    message: String,
    actionMessage: String = "",
    action: () -> Unit = {}
) {
    BuiltInSnacker(this).apply {
        setConfig(config)
        explode(message, actionMessage, action)
    }
}
