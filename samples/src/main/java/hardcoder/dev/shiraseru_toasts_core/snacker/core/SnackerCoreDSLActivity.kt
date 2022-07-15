package hardcoder.dev.shiraseru_toasts_core.snacker.core

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import by.kirich1409.viewbindingdelegate.viewBinding
import hardcoder.dev.shiraseru_toasts_core.R
import hardcoder.dev.shiraseru_toasts_core.databinding.ActivitySnackerCoreDslBinding
import hardcoder.dev.shiraseru_snackbars_dsl.snacker

class SnackerCoreDSLActivity : AppCompatActivity() {

    private val binding by viewBinding<ActivitySnackerCoreDslBinding> { }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snacker_core_dsl)
        setUpClicks()
        setUpViews()
    }

    private fun setUpViews() = with(binding) {
        toolbarExample.exampleTitleButton.text = "Snackbars Core DSL"
    }

    private fun setUpClicks() = with(binding) {
        launchSnackbarButton.setOnClickListener {
            showCoreDSLSnackbar()
        }

        toolbarExample.backIconImageView.setOnClickListener {
            finish()
        }
    }

    private fun showCoreDSLSnackbar() {
        binding.root.snacker {
            message = "My Snackbar!"
            actionMessage = "Undo"
            doWhenActionPressed = {
                Log.i("LOG_TAG", "Snackbar action was called!")
            }

            config {
                shape {
                    background byResource R.drawable.shape_16
                    tint byValue Color.BLACK
                }

                extraImage {
                    extraImage byValue ResourcesCompat.getDrawable(resources, R.drawable.ic_cart, theme)
                    scaleType byEnum ImageView.ScaleType.CENTER_CROP
                }

                visibility {
                    isNeedToShowAction byValue true
                    isNeedToShowIcon byValue true
                    isNeedToShowExtraPicture byValue true
                    isNeedToShowDelimiter byValue true
                }

                typography {
                    messageTextColor byValue Color.WHITE
                    actionTextColor byValue Color.WHITE
                    messageTextSize byValue 20
                    actionTextSize byValue 18
                    messageTypeface byEnum Typeface.DEFAULT_BOLD
                    actionTypeface byEnum Typeface.MONOSPACE
                }

                delimiter {
                    color byResource R.color.white
                    shape byResource R.drawable.shape_16
                    width byValue 8
                }

                sizing {
                    marginBottom byValue 64
                    marginStart byValue 64
                    marginEnd byValue 64
                }
            }
        }
    }
}