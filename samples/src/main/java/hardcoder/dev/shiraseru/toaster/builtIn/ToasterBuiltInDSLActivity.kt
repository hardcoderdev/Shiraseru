package hardcoder.dev.shiraseru.toaster.builtIn

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import hardcoder.dev.shiraseru.R
import hardcoder.dev.shiraseru.databinding.ActivityToasterBuiltInDslBinding
import hardcoder.dev.shiraseru_core.mappers.IconGravity
import hardcoder.dev.shiraseru_toasts_built_in.config.BuiltInToasterState
import hardcoder.dev.shiraseru_toasts_built_in_dsl.builtInToaster

class ToasterBuiltInDSLActivity : AppCompatActivity() {

    private val binding by viewBinding<ActivityToasterBuiltInDslBinding>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toaster_built_in_dsl)
        setUpClicks()
        setUpViews()
    }

    private fun setUpViews() = with(binding) {
        toolbarExample.exampleTitleButton.text = "Toasts Built In DSL"
    }

    private fun setUpClicks() = with(binding) {
        launchToastButton.setOnClickListener {
            showBuiltInDSLToast()
        }

        toolbarExample.backIconImageView.setOnClickListener {
            finish()
        }
    }

    private fun showBuiltInDSLToast() {
        builtInToaster {
            message = "Wow! Msg, yeah."
            config {
                state byEnum BuiltInToasterState.SUCCESS
                iconGravity byEnum IconGravity.END
                isNeedToShowIcon byValue true
                iconTint byResource R.color.white
                textColor byValue Color.WHITE
            }
        }
    }
}