package hardcoder.dev.shiraseru_toasts_built_in.config

import hardcoder.dev.shiraseru_toasts_core.ToasterDuration
import hardcoder.dev.shiraseru_core.mappers.IconGravity
import hardcoder.dev.shiraseru_resources.R

data class BuiltInToasterConfig(
    val state: BuiltInToasterState = BuiltInToasterState.SUCCESS,
    val showDuration: ToasterDuration = ToasterDuration.SHORT,
    val iconTint: BuiltInIconTint = BuiltInIconTint(R.color.white),
    val textColor: BuiltInTextColor = BuiltInTextColor(R.color.white),
    val iconGravity: IconGravity = IconGravity.END,
    val isNeedToShowIcon: BuiltInIsNeedToShowIcon = BuiltInIsNeedToShowIcon(true)
)

data class BuiltInIconTint(val value: Int)
data class BuiltInTextColor(val value: Int)
data class BuiltInIsNeedToShowIcon(val value: Boolean)
