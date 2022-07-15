package hardcoder.dev.shiraseru_toasts_dsl.config

import android.content.Context
import androidx.annotation.DimenRes
import hardcoder.dev.shiraseru.config.*
import hardcoder.dev.shiraseru_core.mappers.IconGravity
import hardcoder.dev.shiraseru_core.mappers.ToasterGravity

class GravityConfigDslBuilder(private val context: Context) {

    var icon = IconGravity.END
    var toaster = ToasterGravity.CENTER
    var xOffset = XOffsetValue(0)
    var yOffset = YOffsetValue(0)

    infix fun IconGravity.byEnum(value: IconGravity) {
        icon = value
    }

    infix fun ToasterGravity.byEnum(value: ToasterGravity) {
        toaster = value
    }

    infix fun XOffset.byValue(value: Int) {
        xOffset = XOffsetValue(value)
    }

    infix fun YOffset.byValue(yOffsetValue: Int) {
        yOffset = YOffsetValue(yOffsetValue)
    }

    infix fun XOffset.byResource(@DimenRes xOffsetResourceId: Int) {
        xOffset = XOffsetValue(context.resources.getDimension(xOffsetResourceId).toInt())
    }

    fun YOffset.byResource(@DimenRes yOffsetResourceId: Int) {
        yOffset = YOffsetValue(context.resources.getDimension(yOffsetResourceId).toInt())
    }

    fun build() = GravityConfig(icon, toaster, xOffset, yOffset)
}