package hardcoder.dev.shiraseru_toasts_built_in_dsl

import android.content.Context
import hardcoder.dev.shiraseru_core.exceptions.NoMessageSpecifiedException
import hardcoder.dev.shiraseru_toasts_built_in.BuiltInToaster
import hardcoder.dev.shiraseru_toasts_built_in.config.BuiltInToasterConfig
import hardcoder.dev.shiraseru_toasts_built_in_dsl.config.BuiltInToasterConfigDslBuilder

class BuiltInToasterDslBuilder(private val context: Context) {

    var configuration: BuiltInToasterConfig? = null
    var message: String = ""

    fun config(block: BuiltInToasterConfigDslBuilder.() -> Unit) {
        configuration = BuiltInToasterConfigDslBuilder(context).apply(block).build()
    }

    fun build(): BuiltInToaster {
        return if (message.isNotBlank()) {
            BuiltInToaster(context).apply {
                setConfig(requireNotNull(configuration))
                explode(message)
            }
        } else {
            throw NoMessageSpecifiedException()
        }
    }
}