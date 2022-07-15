package hardcoder.dev.shiraseru_snackbars_core.config

import hardcoder.dev.shiraseru_core.mappers.*

data class GravityConfig(
    val iconGravity: IconGravity = IconGravity.END,
    val toasterGravity: ToasterGravity = ToasterGravity.CENTER,
    val xOffset: XOffset = XOffsetValue(0),
    val yOffset: YOffset = YOffsetValue(0)
)

data class XOffsetValue(val value: Int) : XOffset()

data class YOffsetValue(val value: Int) : YOffset()

abstract class XOffset

abstract class YOffset