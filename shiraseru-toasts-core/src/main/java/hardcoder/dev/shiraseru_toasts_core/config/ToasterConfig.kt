package hardcoder.dev.shiraseru_toasts_core.config

import hardcoder.dev.shiraseru_toasts_core.ToasterDuration

data class ToasterConfig(
    val shapeConfig: ShapeConfig,
    val gravityConfig: GravityConfig,
    val typographyConfig: TypographyConfig,
    val iconConfig: IconConfig,
    val showDuration: ToasterDuration = ToasterDuration.SHORT,
    val isNeedToShowIcon: Boolean = true
)
