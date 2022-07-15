package hardcoder.dev.shiraseru_snackbars_dsl

import android.content.Context
import hardcoder.dev.shiraseru_snackbars_core.SnackerDuration
import hardcoder.dev.shiraseru_snackbars_core.config.*

class SnackerConfigDslBuilder(private val context: Context) {

    var delimiterConfig = DelimiterConfig()
    var iconConfig = IconConfig()
    var gravityConfig = GravityConfig()
    var typographyConfig = TypographyConfig()
    var extraImageConfig = ExtraImageConfig()
    var shapeConfig = ShapeConfig()
    var visibilityConfig = VisibilityConfig()
    var sizingConfig = SizingConfig()
    var showDuration = SnackerDuration.SHORT

    fun gravity(block: GravityConfigDslBuilder.() -> Unit) {
        gravityConfig = GravityConfigDslBuilder(context).apply(block).build()
    }

    fun shape(block: ShapeConfigDslBuilder.() -> Unit) {
        shapeConfig = ShapeConfigDslBuilder(context).apply(block).build()
    }

    fun typography(block: TypographyConfigDslBuilder.() -> Unit) {
        typographyConfig = TypographyConfigDslBuilder(context).apply(block).build()
    }

    fun icon(block: IconConfigDslBuilder.() -> Unit) {
        iconConfig = IconConfigDslBuilder(context).apply(block).build()
    }

    fun visibility(block: VisibilityConfigDslBuilder.() -> Unit) {
        visibilityConfig = VisibilityConfigDslBuilder(context).apply(block).build()
    }

    fun extraImage(block: ExtraImageConfigDslBuilder.() -> Unit) {
        extraImageConfig = ExtraImageConfigDslBuilder(context).apply(block).build()
    }

    fun delimiter(block: DelimiterConfigDslBuilder.() -> Unit) {
        delimiterConfig = DelimiterConfigDslBuilder(context).apply(block).build()
    }

    fun sizing(block: SizingConfigDslBuilder.() -> Unit) {
        sizingConfig = SizingConfigDslBuilder(context).apply(block).build()
    }

    fun build() = SnackerConfig(
        delimiterConfig,
        iconConfig,
        gravityConfig,
        typographyConfig,
        extraImageConfig,
        shapeConfig,
        visibilityConfig,
        sizingConfig,
        showDuration
    )
}