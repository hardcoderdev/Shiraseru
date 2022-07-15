package hardcoder.dev.shiraseru_toasts_core.snacker.builtIn

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import hardcoder.dev.shiraseru_toasts_core.R
import hardcoder.dev.shiraseru_toasts_core.databinding.ActivitySnackerBuiltInDslBinding
import hardcoder.dev.shiraseru_core.mappers.IconGravity
import hardcoder.dev.shiraseru_snackbars_built_in.config.*
import hardcoder.dev.shiraseru_snackbars_built_in_dsl.builtInSnacker
import hardcoder.dev.shiraseru_snackbars_core.SnackerDuration

class SnackerBuiltInDSLActivity : AppCompatActivity() {

    private val binding by viewBinding<ActivitySnackerBuiltInDslBinding>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snacker_built_in_dsl)
        setUpClicks()
        setUpViews()
    }

    private fun setUpViews() = with(binding) {
        toolbarExample.exampleTitleButton.text = "Snackbars Built In DSL"
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
        root.builtInSnacker {
            config {
                state byEnum BuiltInSnackerState.INFO
                isNeedToShowIcon byValue true
                iconTint byResource R.color.white
                iconPadding byValue 20
                messageTextColor byResource R.color.white
                showDuration byEnum SnackerDuration.LONG
                iconGravity byEnum IconGravity.START
                isFloating byValue true
                message = "Snacker Example"
                action = "OK"
                doWhenActionPressed = {
                    Log.i("LOG_TAG", "Snackbar action was called!")
                }
            }
        }
    }
}