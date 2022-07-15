package hardcoder.dev.shiraseru_snackbars_core.config

import hardcoder.dev.shiraseru_snackbars_core.SnackerDuration

data class SnackerConfig(
    val delimiterConfig: DelimiterConfig,
    val iconConfig: IconConfig,
    val gravityConfig: GravityConfig,
    val typographyConfig: TypographyConfig,
    val extraImageConfig: ExtraImageConfig,
    val shapeConfig: ShapeConfig,
    val visibilityConfig: VisibilityConfig,
    val sizingConfig: SizingConfig,
    val showDuration: SnackerDuration,
)
