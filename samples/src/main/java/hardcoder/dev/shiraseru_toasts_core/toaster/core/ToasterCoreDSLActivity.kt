package hardcoder.dev.shiraseru_toasts_core.toaster.core

import android.graphics.Typeface
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import hardcoder.dev.shiraseru_toasts_core.R
import hardcoder.dev.shiraseru_toasts_core.databinding.ActivityToasterCoreDslBinding
import hardcoder.dev.shiraseru_core.mappers.IconGravity
import hardcoder.dev.shiraseru_core.mappers.ToasterGravity
import hardcoder.dev.shiraseru_toasts_dsl.toaster

class ToasterCoreDSLActivity : AppCompatActivity() {

    private val binding by viewBinding<ActivityToasterCoreDslBinding> { }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toaster_core_dsl)
        setUpClicks()
        setUpViews()
    }

    private fun setUpViews() = with(binding) {
        toolbarExample.exampleTitleButton.text = "Toasts Core DSL"
    }

    private fun setUpClicks() = with(binding) {
        launchToastButton.setOnClickListener {
            showCoreDSLToast()
        }

        toolbarExample.backIconImageView.setOnClickListener {
            finish()
        }
    }

    private fun showCoreDSLToast() {
        toaster {
            message = "Successful purchase!"
            config {
                shape {
                    background byResource R.drawable.shape_16
                    tint byResource R.color.black
                }

                icon {
                    drawable byResource R.drawable.ic_cart
                    tint byResource R.color.white
                    padding byValue 22
                }

                typography {
                    typeface byEnum Typeface.DEFAULT
                    textColorResourceId byResource R.color.white
                    textGravity byEnum ToasterGravity.CENTER
                    textSize byValue 20
                }

                gravity {
                    icon byEnum IconGravity.END
                    toaster byEnum ToasterGravity.BOTTOM
                    xOffset byValue 0
                    yOffset byValue 64
                }
            }
        }
    }
}