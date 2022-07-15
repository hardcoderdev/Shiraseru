@file:Suppress("DeprecatedCallableAddReplaceWith", "unused", "UNUSED_PARAMETER")

package hardcoder.dev.shiraseru_toasts_dsl

import android.content.Context
import hardcoder.dev.shiraseru.Toaster
import hardcoder.dev.shiraseru_toasts_dsl.config.*

/** DSL FUNCTIONS FOR BUILD CUSTOMIZABLE DSL TOASTS **/

fun Context.toaster(block: ToasterDslBuilder.() -> Unit): Toaster {
    return ToasterDslBuilder(this).apply(block).build()
}

/** DSL FUNCTIONS FOR BUILD DSL TOASTS, DEPRECATED FOR BETTER CONTEXT CONTROL  **/

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ToasterDslBuilder.toasterString(block: ToasterDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ToasterConfigDslBuilder.toasterString(block: ToasterDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ToasterConfigDslBuilder.config(block: ToasterConfigDslBuilder.() -> Unit) = Unit


@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun GravityConfigDslBuilder.gravity(block: GravityConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ShapeConfigDslBuilder.gravity(block: GravityConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun TypographyConfigDslBuilder.gravity(block: GravityConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun IconConfigDslBuilder.gravity(block: GravityConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ToasterDslBuilder.gravity(block: GravityConfigDslBuilder.() -> Unit) = Unit


@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ShapeConfigDslBuilder.shape(block: ShapeConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun GravityConfigDslBuilder.shape(block: ShapeConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun TypographyConfigDslBuilder.shape(block: ShapeConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun IconConfigDslBuilder.shape(block: ShapeConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ToasterDslBuilder.shape(block: GravityConfigDslBuilder.() -> Unit) = Unit


@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun IconConfigDslBuilder.icon(block: IconConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun GravityConfigDslBuilder.icon(block: IconConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ShapeConfigDslBuilder.icon(block: IconConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun TypographyConfigDslBuilder.icon(block: IconConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ToasterDslBuilder.icon(block: IconConfigDslBuilder.() -> Unit) = Unit


@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun TypographyConfigDslBuilder.typography(block: TypographyConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun GravityConfigDslBuilder.typography(block: TypographyConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ShapeConfigDslBuilder.typography(block: TypographyConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun IconConfigDslBuilder.typography(block: TypographyConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ToasterDslBuilder.typography(block: TypographyConfigDslBuilder.() -> Unit) = Unit