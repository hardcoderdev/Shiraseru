package hardcoder.dev.shiraseru_snackbars_dsl

import android.content.Context
import android.view.View
import hardcoder.dev.shiraseru_core.exceptions.NoMessageSpecifiedException
import hardcoder.dev.shiraseru_snackbars_core.Snacker
import hardcoder.dev.shiraseru_snackbars_core.config.SnackerConfig

class SnackerDslBuilder(private val context: Context) {

    private var configuration: SnackerConfig? = null

    var actionMessage = ""
    var message = ""

    var doWhenActionPressed = {}

    fun config(block: SnackerConfigDslBuilder.() -> Unit) {
        configuration = SnackerConfigDslBuilder(context).apply(block).build()
    }

    fun build(view: View): Snacker {
        return if (message.isNotBlank()) {
             Snacker(view).apply {
                setConfig(requireNotNull(configuration))
                explode(message, actionMessage, action = {
                    doWhenActionPressed()
                })
            }
        } else {
            throw NoMessageSpecifiedException()
        }
    }
}