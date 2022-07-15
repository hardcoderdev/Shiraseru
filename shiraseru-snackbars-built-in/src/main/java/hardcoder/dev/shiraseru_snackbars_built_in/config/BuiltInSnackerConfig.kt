package hardcoder.dev.shiraseru_snackbars_built_in.config

import android.graphics.Color
import hardcoder.dev.shiraseru_core.mappers.IconGravity
import hardcoder.dev.shiraseru_snackbars_core.SnackerDuration

data class BuiltInSnackerConfig(
    val state: BuiltInSnackerState = BuiltInSnackerState.SUCCESS,
    val showDuration: SnackerDuration = SnackerDuration.SHORT,
    val iconTint: BuiltInIconTint = BuiltInIconTint(Color.WHITE),
    val iconPadding: BuiltInIconPadding = BuiltInIconPadding(16),
    val messageTextColor: BuiltInMessageTextColor = BuiltInMessageTextColor(Color.WHITE),
    val actionTextColor: BuiltInActionTextColor = BuiltInActionTextColor(Color.WHITE),
    val iconGravity: IconGravity = IconGravity.END,
    val isNeedToShowIcon: BuiltInIsNeedToShowIcon = BuiltInIsNeedToShowIcon(true),
    val isNeedToShowAction: BuiltInIsNeedToShowAction = BuiltInIsNeedToShowAction(true),
    val isFloating: IsFloating = IsFloating(true)
)

data class BuiltInIconTint(val value: Int)
data class BuiltInIconPadding(val value: Int)
data class BuiltInMessageTextColor(val value: Int)
data class BuiltInActionTextColor(val value: Int)
data class BuiltInIsNeedToShowIcon(val value: Boolean)
data class BuiltInIsNeedToShowAction(val value: Boolean)
data class IsFloating(val value: Boolean)
