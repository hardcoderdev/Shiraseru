package hardcoder.dev.shiraseru_snackbars_built_in_dsl.config

import android.graphics.Color
import android.view.View
import androidx.annotation.ColorRes
import androidx.annotation.DimenRes
import androidx.core.content.res.ResourcesCompat
import hardcoder.dev.shiraseru_core.mappers.IconGravity
import hardcoder.dev.shiraseru_snackbars_built_in.config.*
import hardcoder.dev.shiraseru_snackbars_core.SnackerDuration

class SnackerConfigDslBuilder(private val view: View) {

    var state = BuiltInSnackerState.SUCCESS
    var showDuration = SnackerDuration.SHORT
    var iconTint: BuiltInIconTint = BuiltInIconTint(Color.WHITE)
    var iconPadding: BuiltInIconPadding = BuiltInIconPadding(16)
    var messageTextColor: BuiltInMessageTextColor = BuiltInMessageTextColor(Color.WHITE)
    var actionTextColor: BuiltInActionTextColor = BuiltInActionTextColor(Color.WHITE)
    var iconGravity = IconGravity.END
    var isFloating: IsFloating = IsFloating(true)
    var isNeedToShowIcon = BuiltInIsNeedToShowIcon(true)
    var isNeedToShowAction = BuiltInIsNeedToShowAction(true)

    infix fun BuiltInSnackerState.byEnum(value: BuiltInSnackerState) {
        state = value
    }

    infix fun SnackerDuration.byEnum(value: SnackerDuration) {
        showDuration = value
    }

    infix fun IconGravity.byEnum(value: IconGravity) {
        iconGravity = value
    }

    infix fun BuiltInIconTint.byValue(value: Int) {
        iconTint = BuiltInIconTint(value)
    }

    infix fun BuiltInIconTint.byResource(@ColorRes value: Int) {
        iconTint = BuiltInIconTint(ResourcesCompat.getColor(view.context.resources, value, view.context.theme))
    }

    infix fun BuiltInMessageTextColor.byValue(value: Int) {
        messageTextColor = BuiltInMessageTextColor(value)
    }

    infix fun BuiltInMessageTextColor.byResource(@ColorRes value: Int) {
        messageTextColor = BuiltInMessageTextColor(ResourcesCompat.getColor(view.context.resources, value, view.context.theme))
    }

    infix fun BuiltInActionTextColor.byValue(value: Int) {
        actionTextColor = BuiltInActionTextColor(value)
    }

    infix fun BuiltInActionTextColor.byResource(@ColorRes value: Int) {
        actionTextColor = BuiltInActionTextColor(ResourcesCompat.getColor(view.context.resources, value, view.context.theme))
    }

    infix fun BuiltInIsNeedToShowIcon.byValue(value: Boolean) {
        isNeedToShowIcon = BuiltInIsNeedToShowIcon(value)
    }

    infix fun BuiltInIsNeedToShowAction.byValue(value: Boolean) {
        isNeedToShowAction = BuiltInIsNeedToShowAction(value)
    }

    infix fun IsFloating.byValue(value: Boolean) {
        isFloating = IsFloating(value)
    }

    infix fun BuiltInIconPadding.byValue(value: Int) {
        iconPadding = BuiltInIconPadding(value)
    }

    infix fun BuiltInIconPadding.byResource(@DimenRes value: Int) {
        iconPadding = BuiltInIconPadding(view.context.resources.getDimension(value).toInt())
    }

    fun build() = BuiltInSnackerConfig(
        state,
        showDuration,
        iconTint,
        iconPadding,
        messageTextColor,
        actionTextColor,
        iconGravity,
        isNeedToShowIcon,
        isNeedToShowAction,
        isFloating
    )
}