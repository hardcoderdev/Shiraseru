@file:Suppress("unused", "DeprecatedCallableAddReplaceWith", "UNUSED_PARAMETER")

package hardcoder.dev.shiraseru_snackbars_dsl

import android.view.View
import hardcoder.dev.shiraseru_snackbars_core.Snacker
import hardcoder.dev.shiraseru_snackbars_core.config.SizingConfig
import hardcoder.dev.shiraseru_snackbars_core.config.VisibilityConfig

/** DSL FUNCTIONS FOR BUILD DSL SNACKBARS  **/

fun View.snacker(block: SnackerDslBuilder.() -> Unit): Snacker {
    return SnackerDslBuilder(context).apply(block).build(this)
}

/** DSL FUNCTIONS FOR BUILD DSL SNACKBARS, DEPRECATED FOR BETTER CONTEXT CONTROL  **/

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun SnackerDslBuilder.snacker(block: SnackerDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun SnackerConfigDslBuilder.snacker(block: SnackerDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun SnackerConfigDslBuilder.config(block: SnackerConfigDslBuilder.() -> Unit) = Unit


@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun GravityConfigDslBuilder.gravity(block: GravityConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ShapeConfigDslBuilder.gravity(block: GravityConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun TypographyConfigDslBuilder.gravity(block: GravityConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun IconConfigDslBuilder.gravity(block: GravityConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun VisibilityConfigDslBuilder.gravity(block: GravityConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ExtraImageConfigDslBuilder.gravity(block: GravityConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun SizingConfigDslBuilder.gravity(block: GravityConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun SnackerDslBuilder.gravity(block: GravityConfigDslBuilder.() -> Unit) = Unit


@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ShapeConfigDslBuilder.shape(block: ShapeConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun GravityConfigDslBuilder.shape(block: ShapeConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun TypographyConfigDslBuilder.shape(block: ShapeConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun IconConfigDslBuilder.shape(block: ShapeConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun VisibilityConfigDslBuilder.shape(block: ShapeConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ExtraImageConfigDslBuilder.shape(block: ShapeConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun SizingConfigDslBuilder.shape(block: ShapeConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun SnackerDslBuilder.shape(block: ShapeConfigDslBuilder.() -> Unit) = Unit


@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun IconConfigDslBuilder.icon(block: IconConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun GravityConfigDslBuilder.icon(block: IconConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ShapeConfigDslBuilder.icon(block: IconConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun TypographyConfigDslBuilder.icon(block: IconConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun VisibilityConfigDslBuilder.icon(block: IconConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ExtraImageConfigDslBuilder.icon(block: IconConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun SizingConfigDslBuilder.icon(block: IconConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun SnackerDslBuilder.icon(block: IconConfigDslBuilder.() -> Unit) = Unit


@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun TypographyConfigDslBuilder.typography(block: TypographyConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun GravityConfigDslBuilder.typography(block: TypographyConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ShapeConfigDslBuilder.typography(block: TypographyConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun IconConfigDslBuilder.typography(block: TypographyConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun VisibilityConfigDslBuilder.typography(block: TypographyConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ExtraImageConfigDslBuilder.typography(block: TypographyConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun SizingConfigDslBuilder.typography(block: TypographyConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun SnackerDslBuilder.typography(block: TypographyConfigDslBuilder.() -> Unit) = Unit


@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun VisibilityConfigDslBuilder.visibility(block: VisibilityConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun GravityConfigDslBuilder.visibility(block: VisibilityConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ShapeConfigDslBuilder.visibility(block: VisibilityConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun IconConfigDslBuilder.visibility(block: VisibilityConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun TypographyConfigDslBuilder.visibility(block: VisibilityConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ExtraImageConfigDslBuilder.visibility(block: VisibilityConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun SizingConfigDslBuilder.visibility(block: VisibilityConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun SnackerDslBuilder.visibility(block: VisibilityConfigDslBuilder.() -> Unit) = Unit


@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ExtraImageConfigDslBuilder.extraImage(block: ExtraImageConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun GravityConfigDslBuilder.extraImage(block: ExtraImageConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ShapeConfigDslBuilder.extraImage(block: ExtraImageConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun IconConfigDslBuilder.extraImage(block: ExtraImageConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun TypographyConfigDslBuilder.extraImage(block: ExtraImageConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun VisibilityConfigDslBuilder.extraImage(block: ExtraImageConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun SizingConfigDslBuilder.extraImage(block: ExtraImageConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun SnackerDslBuilder.extraImage(block: ExtraImageConfigDslBuilder.() -> Unit) = Unit


@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun SizingConfigDslBuilder.sizing(block: SizingConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ShapeConfigDslBuilder.sizing(block: SizingConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun GravityConfigDslBuilder.sizing(block: SizingConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun TypographyConfigDslBuilder.sizing(block: SizingConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun IconConfigDslBuilder.sizing(block: SizingConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun VisibilityConfigDslBuilder.sizing(block: SizingConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun ExtraImageConfigDslBuilder.sizing(block: SizingConfigDslBuilder.() -> Unit) = Unit

@Deprecated(level = DeprecationLevel.ERROR, message = "Incorrect context")
fun SnackerDslBuilder.sizing(block: SizingConfigDslBuilder.() -> Unit) = Unit
