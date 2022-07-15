package hardcoder.dev.shiraseru.config

import hardcoder.dev.shiraseru.ToasterDuration

data class ToasterConfig(
    val shapeConfig: ShapeConfig,
    val gravityConfig: GravityConfig,
    val typographyConfig: TypographyConfig,
    val iconConfig: IconConfig,
    val showDuration: ToasterDuration = ToasterDuration.SHORT,
    val isNeedToShowIcon: Boolean = true
)
