package hardcoder.dev.shiraseru_snackbars_core.config

data class SizingConfig(
    val marginBottom: MarginBottom = MarginBottom(0),
    val marginStart: MarginStart = MarginStart(0),
    val marginEnd: MarginEnd = MarginEnd(0)
)

data class MarginBottom(val value: Int)
data class MarginStart(val value: Int)
data class MarginEnd(val value: Int)


