package hardcoder.dev.shiraseru_toasts_dsl.config

import android.content.Context
import hardcoder.dev.shiraseru.ToasterDuration
import hardcoder.dev.shiraseru.config.*
import hardcoder.dev.shiraseru_core.mappers.IconGravity

class ToasterConfigDslBuilder(private val context: Context) {

    private var gravityConfig = GravityConfig()
    private var shapeConfig = ShapeConfig()
    private var typographyConfig = TypographyConfig()
    private var iconConfig = IconConfig()
    var toasterDuration = ToasterDuration.SHORT
    var isNeedToShowIcon = true

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

    fun build() = ToasterConfig(
        shapeConfig,
        gravityConfig,
        typographyConfig,
        iconConfig,
        toasterDuration,
        isNeedToShowIcon
    )
}



