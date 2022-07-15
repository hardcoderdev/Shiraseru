@file:Suppress("DeprecatedCallableAddReplaceWith", "unused", "UNUSED_PARAMETER")


package hardcoder.dev.shiraseru_toasts_built_in_dsl

import android.content.Context
import hardcoder.dev.shiraseru_toasts_built_in.BuiltInToaster
import hardcoder.dev.shiraseru_toasts_built_in_dsl.config.BuiltInToasterConfigDslBuilder

/** DSL FUNCTIONS FOR BUILD DSL TOASTS **/

fun Context.builtInToaster(block: BuiltInToasterDslBuilder.() -> Unit): BuiltInToaster {
    return BuiltInToasterDslBuilder(this).apply(block).build()
}


/** DSL FUNCTIONS FOR BUILD DSL TOASTS, DEPRECATED FOR BETTER CONTEXT CONTROL  **/

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun BuiltInToasterDslBuilder.builtInToasterString(block: BuiltInToasterDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun BuiltInToasterConfigDslBuilder.builtInToasterString(block: BuiltInToasterDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun BuiltInToasterConfigDslBuilder.config(block: BuiltInToasterConfigDslBuilder.() -> Unit) = Unit