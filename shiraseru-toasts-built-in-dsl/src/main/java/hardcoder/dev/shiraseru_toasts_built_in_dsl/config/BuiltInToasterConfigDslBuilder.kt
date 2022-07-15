package hardcoder.dev.shiraseru_toasts_built_in_dsl.config

import android.content.Context
import androidx.annotation.ColorRes
import androidx.core.content.res.ResourcesCompat
import hardcoder.dev.shiraseru_toasts_core.ToasterDuration
import hardcoder.dev.shiraseru_core.mappers.IconGravity
import hardcoder.dev.shiraseru_resources.R
import hardcoder.dev.shiraseru_toasts_built_in.config.*

class BuiltInToasterConfigDslBuilder(private val context: Context) {

    var state = BuiltInToasterState.SUCCESS
    var toasterDuration = ToasterDuration.SHORT
    var iconGravity = IconGravity.END
    var iconTint = BuiltInIconTint(R.color.white)
    var isNeedToShowIcon = BuiltInIsNeedToShowIcon(true)
    var textColor = BuiltInTextColor(R.color.white)

    infix fun BuiltInToasterState.byEnum(value: BuiltInToasterState) {
        state = value
    }

    infix fun ToasterDuration.byEnum(value: ToasterDuration) {
        toasterDuration = value
    }

    infix fun IconGravity.byEnum(value: IconGravity) {
        iconGravity = value
    }

    infix fun BuiltInIconTint.byValue(value: Int) {
        iconTint = BuiltInIconTint(value)
    }

    infix fun BuiltInIconTint.byResource(@ColorRes value: Int) {
        iconTint = BuiltInIconTint(ResourcesCompat.getColor(context.resources, value, context.theme))
    }

    infix fun BuiltInTextColor.byValue(value: Int) {
        textColor = BuiltInTextColor(value)
    }

    infix fun BuiltInTextColor.byResource(@ColorRes value: Int) {
        textColor = BuiltInTextColor(ResourcesCompat.getColor(context.resources, value, context.theme))
    }

    infix fun BuiltInIsNeedToShowIcon.byValue(value: Boolean) {
        isNeedToShowIcon = BuiltInIsNeedToShowIcon(value)
    }

    fun build() = BuiltInToasterConfig(
        state,
        toasterDuration,
        iconTint,
        textColor,
        iconGravity,
        isNeedToShowIcon
    )
}
