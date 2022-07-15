package hardcoder.dev.shiraseru.toaster.core

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import by.kirich1409.viewbindingdelegate.viewBinding
import hardcoder.dev.shiraseru.R
import hardcoder.dev.shiraseru.ToasterDuration
import hardcoder.dev.shiraseru.config.*
import hardcoder.dev.shiraseru.databinding.ActivityToasterCoreBinding
import hardcoder.dev.shiraseru.extensions.toaster
import hardcoder.dev.shiraseru_core.mappers.IconGravity
import hardcoder.dev.shiraseru_core.mappers.ToasterGravity

class ToasterCoreActivity : AppCompatActivity() {

    private val binding by viewBinding<ActivityToasterCoreBinding>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toaster_core)
        setUpClicks()
        setUpViews()
    }

    private fun setUpViews() = with(binding) {
        toolbarExample.exampleTitleButton.text = "Toasts Core"
    }

    private fun setUpClicks() = with(binding) {
        launchToastButton.setOnClickListener {
            showCoreToast()
        }

        toolbarExample.backIconImageView.setOnClickListener {
            finish()
        }
    }

    private fun showCoreToast() {
        toaster(
            message = "Example core...",
            config = ToasterConfig(
                isNeedToShowIcon = true,
                showDuration = ToasterDuration.SHORT,
                shapeConfig = ShapeConfig(
                    background = Background(ResourcesCompat.getDrawable(resources, R.drawable.shape_16, theme)),
                    tint = BackgroundTint(ResourcesCompat.getColor(resources, R.color.black, theme))
                ),
                typographyConfig = TypographyConfig(
                    textColor = TextColor(ResourcesCompat.getColor(resources, R.color.white, theme)),
                    textSize = TextSize(22),
                    textGravity = ToasterGravity.CENTER
                ),
                iconConfig = IconConfig(
                    drawable = Icon(ResourcesCompat.getDrawable(resources, R.drawable.ic_cart, theme)),
                    tint = IconTint(Color.WHITE),
                    padding = IconPadding(16)
                ),
                gravityConfig = GravityConfig(
                    iconGravity = IconGravity.END,
                    toasterGravity = ToasterGravity.BOTTOM,
                    xOffset = XOffsetValue(0),
                    yOffset = YOffsetValue(64)
                )
            )
        )
    }
}