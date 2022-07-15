package hardcoder.dev.shiraseru_core.mappers

import android.view.Gravity

/**
 *  MADE THIS MAPPER BECAUSE GRAVITY IS CLASS WITH CONSTANTS,
 *  AND WE CAN'T PASS THIS AS ARGUMENT IN DATA CLASS.
 */

class ToastGravityMapper {

    fun toGravityValue(toasterGravity: ToasterGravity): Int {
        return when (toasterGravity) {
            ToasterGravity.START -> Gravity.START
            ToasterGravity.CENTER -> Gravity.CENTER
            ToasterGravity.END -> Gravity.END
            ToasterGravity.CENTER_HORIZONTAL -> Gravity.CENTER_HORIZONTAL
            ToasterGravity.CENTER_VERTICAL -> Gravity.CENTER_VERTICAL
            ToasterGravity.TOP -> Gravity.TOP
            ToasterGravity.BOTTOM -> Gravity.BOTTOM
        }
    }
}