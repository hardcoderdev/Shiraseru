package hardcoder.dev.shiraseru_snackbars_built_in_dsl

import android.view.View
import hardcoder.dev.shiraseru_core.exceptions.NoMessageSpecifiedException
import hardcoder.dev.shiraseru_snackbars_built_in.BuiltInSnacker
import hardcoder.dev.shiraseru_snackbars_built_in.config.BuiltInSnackerConfig
import hardcoder.dev.shiraseru_snackbars_built_in_dsl.config.SnackerConfigDslBuilder

class SnackerDslBuilder(private val view: View) {

    var configuration: BuiltInSnackerConfig? = null
    var message = ""
    var action = ""
    var doWhenActionPressed = {}

    fun config(block: SnackerConfigDslBuilder.() -> Unit) {
        configuration = SnackerConfigDslBuilder(view).apply(block).build()
    }

    fun build(): BuiltInSnacker {
        return if (message.isNotBlank()) {
            BuiltInSnacker(view).apply {
                setConfig(requireNotNull(configuration))
                explode(message, action, doWhenActionPressed)
            }
        } else {
            throw NoMessageSpecifiedException()
        }
    }
}