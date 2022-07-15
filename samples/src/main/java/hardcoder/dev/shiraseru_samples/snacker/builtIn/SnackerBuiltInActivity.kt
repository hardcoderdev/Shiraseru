package hardcoder.dev.shiraseru_samples.snacker.builtIn

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import hardcoder.dev.shiraseru_core.mappers.IconGravity
import hardcoder.dev.shiraseru_samples.R
import hardcoder.dev.shiraseru_samples.databinding.ActivitySnackerBuiltInBinding
import hardcoder.dev.shiraseru_snackbars_built_in.config.*
import hardcoder.dev.shiraseru_snackbars_built_in.extensions.builtInSnacker

class SnackerBuiltInActivity : AppCompatActivity() {

    private val binding by viewBinding<ActivitySnackerBuiltInBinding>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snacker_built_in)
        setUpClicks()
        setUpViews()
    }

    private fun setUpViews() = with(binding) {
        toolbarExample.exampleTitleButton.text = "Snackbars Built In"
    }

    private fun setUpClicks() = with(binding) {
        launchSnackbarButton.setOnClickListener {
            showBuiltInSnackbar()
        }

        toolbarExample.backIconImageView.setOnClickListener {
            finish()
        }
    }

    private fun showBuiltInSnackbar() = with(binding) {
        root.builtInSnacker(
            config = BuiltInSnackerConfig(
                state = BuiltInSnackerState.WARNING,
                isNeedToShowAction = BuiltInIsNeedToShowAction(false),
                isNeedToShowIcon = BuiltInIsNeedToShowIcon(false),
                messageTextColor = BuiltInMessageTextColor(Color.BLACK),
                iconGravity = IconGravity.END,
                isFloating = IsFloating(false)
            ),
            message = "Example Snackbar"
        )
    }
}