package hardcoder.dev.shiraseru_snackbars_dsl

import android.content.Context
import hardcoder.dev.shiraseru_snackbars_core.config.*

class VisibilityConfigDslBuilder(private val context: Context) {

    var isNeedToShowAction: IsNeedToShowAction = IsNeedToShowAction(true)
    var isNeedToShowIcon: IsNeedToShowIcon = IsNeedToShowIcon(true)
    var isNeedToShowExtraPicture: IsNeedToShowExtraPicture = IsNeedToShowExtraPicture(false)
    var isNeedToShowDelimiter: IsNeedToShowDelimiter = IsNeedToShowDelimiter(true)

    infix fun IsNeedToShowAction.byValue(value: Boolean) {
        isNeedToShowAction = IsNeedToShowAction(value)
    }

    infix fun IsNeedToShowIcon.byValue(value: Boolean) {
        isNeedToShowIcon = IsNeedToShowIcon(value)
    }

    infix fun IsNeedToShowExtraPicture.byValue(value: Boolean) {
        isNeedToShowExtraPicture = IsNeedToShowExtraPicture(value)
    }

    infix fun IsNeedToShowDelimiter.byValue(value: Boolean) {
        isNeedToShowDelimiter = IsNeedToShowDelimiter(value)
    }

    fun build() = VisibilityConfig(
        isNeedToShowAction,
        isNeedToShowIcon,
        isNeedToShowExtraPicture
    )
}