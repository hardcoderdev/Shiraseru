package hardcoder.dev.shiraseru_toasts_dsl

import android.content.Context
import hardcoder.dev.shiraseru_toasts_core.Toaster
import hardcoder.dev.shiraseru_toasts_core.config.ToasterConfig
import hardcoder.dev.shiraseru_core.exceptions.NoMessageSpecifiedException
import hardcoder.dev.shiraseru_toasts_dsl.config.ToasterConfigDslBuilder

class ToasterDslBuilder(private val context: Context) {

    private var configuration: ToasterConfig? = null
    var message: String = ""

    fun config(block: ToasterConfigDslBuilder.() -> Unit) {
        configuration = ToasterConfigDslBuilder(context).apply(block).build()
    }

    fun build() = Toaster(context).apply {
        return if (message.isNotBlank()) {
            Toaster(context).apply {
                setConfig(requireNotNull(configuration))
                explode(message)
            }
        } else {
            throw NoMessageSpecifiedException()
        }
    }
}