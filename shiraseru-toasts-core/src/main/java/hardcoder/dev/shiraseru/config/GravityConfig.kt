package hardcoder.dev.shiraseru.config

import hardcoder.dev.shiraseru_core.mappers.IconGravity
import hardcoder.dev.shiraseru_core.mappers.ToasterGravity

data class GravityConfig(
    val iconGravity: IconGravity = IconGravity.END,
    val toasterGravity: ToasterGravity = ToasterGravity.CENTER,
    val xOffset: XOffsetValue = XOffsetValue(0),
    val yOffset: YOffsetValue = YOffsetValue(0)
)

data class XOffsetValue(val value: Int) : XOffset()

data class YOffsetValue(val value: Int) : YOffset()

abstract class XOffset

abstract class YOffset