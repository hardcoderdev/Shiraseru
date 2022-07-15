@file:Suppress("unused", "DeprecatedCallableAddReplaceWith", "UNUSED_PARAMETER")

package hardcoder.dev.shiraseru_snackbars_built_in_dsl

import android.view.View
import hardcoder.dev.shiraseru_snackbars_built_in.BuiltInSnacker
import hardcoder.dev.shiraseru_snackbars_built_in_dsl.config.SnackerConfigDslBuilder

/** DSL FUNCTIONS FOR BUILD DSL SNACKBARS  **/

fun View.builtInSnacker(block: SnackerDslBuilder.() -> Unit): BuiltInSnacker {
    return SnackerDslBuilder(this).apply(block).build()
}

/** DSL FUNCTIONS FOR BUILD DSL SNACKBARS, DEPRECATED FOR BETTER CONTEXT CONTROL  **/

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun SnackerDslBuilder.builtInSnacker(block: SnackerDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun SnackerConfigDslBuilder.config(block: SnackerConfigDslBuilder.() -> Unit) = Unit

