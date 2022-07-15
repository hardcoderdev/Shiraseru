package hardcoder.dev.shiraseru_snackbars_core.config

data class VisibilityConfig(
    val isNeedToShowAction: IsNeedToShowAction = IsNeedToShowAction(true),
    val isNeedToShowIcon: IsNeedToShowIcon = IsNeedToShowIcon(true),
    val isNeedToShowExtraPicture: IsNeedToShowExtraPicture = IsNeedToShowExtraPicture(false),
    val isNeedToShowDelimiter: IsNeedToShowDelimiter = IsNeedToShowDelimiter(true)
)

data class IsNeedToShowAction(val value: Boolean)
data class IsNeedToShowIcon(val value: Boolean)
data class IsNeedToShowExtraPicture(val value: Boolean)
data class IsNeedToShowDelimiter(val value: Boolean)

