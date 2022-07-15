package hardcoder.dev.shiraseru_samples.toaster.builtIn

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import hardcoder.dev.shiraseru_samples.R
import hardcoder.dev.shiraseru_samples.databinding.ActivityToasterCoreBinding
import hardcoder.dev.shiraseru_core.mappers.IconGravity
import hardcoder.dev.shiraseru_toasts_built_in.config.*
import hardcoder.dev.shiraseru_toasts_built_in.extensions.builtInToaster

class ToasterBuiltInActivity : AppCompatActivity() {

    private val binding by viewBinding<ActivityToasterCoreBinding>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toaster_built_in)
        setUpClicks()
        setUpViews()
    }

    private fun setUpViews() = with(binding) {
        toolbarExample.exampleTitleButton.text = "Toasts Built In"
    }

    private fun setUpClicks() = with(binding) {
        launchToastButton.setOnClickListener {
            showBuiltInToast()
        }

        toolbarExample.backIconImageView.setOnClickListener {
            finish()
        }
    }

    private fun showBuiltInToast() {
        builtInToaster(
            message = "Example built-in...",
            config = BuiltInToasterConfig(
                state = BuiltInToasterState.ERROR,
                isNeedToShowIcon = BuiltInIsNeedToShowIcon(true),
                textColor = BuiltInTextColor(Color.WHITE),
                iconTint = BuiltInIconTint(Color.WHITE),
                iconGravity = IconGravity.END
            )
        )
    }
}