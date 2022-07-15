package hardcoder.dev.shiraseru_snackbars_dsl

import android.content.Context
import androidx.annotation.DimenRes
import hardcoder.dev.shiraseru_snackbars_core.config.MarginBottom
import hardcoder.dev.shiraseru_snackbars_core.config.MarginEnd
import hardcoder.dev.shiraseru_snackbars_core.config.MarginStart
import hardcoder.dev.shiraseru_snackbars_core.config.SizingConfig

class SizingConfigDslBuilder(private val context: Context) {

    var marginBottom: MarginBottom = MarginBottom(0)
    var marginStart: MarginStart = MarginStart(0)
    var marginEnd: MarginEnd = MarginEnd(0)

    infix fun MarginBottom.byValue(value: Int) {
        marginBottom = MarginBottom(value)
    }

    infix fun MarginBottom.byResource(@DimenRes value: Int) {
        marginBottom = MarginBottom(context.resources.getDimension(value).toInt())
    }

    infix fun MarginStart.byValue(value: Int) {
        marginStart = MarginStart(value)
    }

    infix fun MarginStart.byResource(@DimenRes value: Int) {
        marginStart = MarginStart(context.resources.getDimension(value).toInt())
    }

    infix fun MarginEnd.byValue(value: Int) {
        marginEnd = MarginEnd(value)
    }

    infix fun MarginEnd.byResource(@DimenRes value: Int) {
        marginEnd = MarginEnd(context.resources.getDimension(value).toInt())
    }

    fun build() = SizingConfig(marginBottom, marginStart, marginEnd)
}