package hardcoder.dev.shiraseru_toasts_built_in.extensions

import android.content.Context
import hardcoder.dev.shiraseru_toasts_built_in.BuiltInToaster
import hardcoder.dev.shiraseru_toasts_built_in.config.BuiltInToasterConfig

fun Context.builtInToaster(
    config: BuiltInToasterConfig,
    message: String
) {
    BuiltInToaster(this).apply {
        setConfig(config)
        explode(message)
    }
}



