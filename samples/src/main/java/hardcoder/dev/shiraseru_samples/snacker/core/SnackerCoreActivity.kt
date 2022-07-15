package hardcoder.dev.shiraseru_samples.snacker.core

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import by.kirich1409.viewbindingdelegate.viewBinding
import hardcoder.dev.shiraseru_core.mappers.IconGravity
import hardcoder.dev.shiraseru_core.mappers.ToasterGravity
import hardcoder.dev.shiraseru_samples.R
import hardcoder.dev.shiraseru_samples.databinding.ActivitySnackerCoreBinding
import hardcoder.dev.shiraseru_snackbars_core.SnackerDuration
import hardcoder.dev.shiraseru_snackbars_core.config.*
import hardcoder.dev.shiraseru_snackbars_core.extensions.snacker

class SnackerCoreActivity : AppCompatActivity() {

    private val binding by viewBinding<ActivitySnackerCoreBinding>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snacker_core)
        setUpClicks()
        setUpViews()
    }

    private fun setUpViews() = with(binding) {
        toolbarExample.exampleTitleButton.text = "Snackbars Core"
    }

    private fun setUpClicks() = with(binding) {
        launchSnackbarButton.setOnClickListener {
            showCoreSnackbar()
        }

        toolbarExample.backIconImageView.setOnClickListener {
            finish()
        }
    }

    private fun showCoreSnackbar() {
        binding.root.snacker(
            config = SnackerConfig(
                delimiterConfig = DelimiterConfig(
                    color = DelimiterColor(Color.WHITE),
                    width = DelimiterWidth(16),
                    shape = DelimiterShape(ResourcesCompat.getDrawable(resources, R.drawable.shape_16, theme))
                ),
                iconConfig = IconConfig(
                    drawable = Icon(ResourcesCompat.getDrawable(resources, R.drawable.ic_cart, theme)),
                    tint = IconTint(Color.WHITE),
                    padding = IconPadding(16)
                ),
                gravityConfig = GravityConfig(
                    iconGravity = IconGravity.END,
                    toasterGravity = ToasterGravity.CENTER_HORIZONTAL,
                    xOffset = XOffsetValue(0),
                    yOffset = YOffsetValue(0)
                ),
                typographyConfig = TypographyConfig(
                    messageGravity = ToasterGravity.CENTER,
                    messageTypeface = MessageTypeface(Typeface.DEFAULT_BOLD),
                    actionTypeface = ActionTypeface(Typeface.MONOSPACE),
                    messageTextSize = MessageTextSize(18),
                    actionTextSize = ActionTextSize(16),
                    messageTextColor = MessageTextColor(Color.WHITE),
                    actionTextColor = ActionTextColor(Color.WHITE)
                ),
                extraImageConfig = ExtraImageConfig(
                    image = ExtraImage(ResourcesCompat.getDrawable(resources, R.drawable.ic_read_more, theme)),
                    scaleType = ImageView.ScaleType.CENTER
                ),
                shapeConfig = ShapeConfig(
                    background = Background(ResourcesCompat.getDrawable(resources, R.drawable.shape_16, theme)),
                    tint = BackgroundTint(Color.BLACK)
                ),
                visibilityConfig = VisibilityConfig(
                    isNeedToShowIcon = IsNeedToShowIcon(true),
                    isNeedToShowAction = IsNeedToShowAction(true),
                    isNeedToShowDelimiter = IsNeedToShowDelimiter(true),
                    isNeedToShowExtraPicture = IsNeedToShowExtraPicture(true)
                ),
                sizingConfig = SizingConfig(
                    marginBottom = MarginBottom(64),
                    marginStart = MarginStart(64),
                    marginEnd = MarginEnd(64)
                ),
                showDuration = SnackerDuration.LONG
            ),
            message = "Snacker Example",
            actionMessage = "Undo",
            action = {
                Log.i("LOG_TAG", "Snackbar action was called!")
            }
        )
    }
}