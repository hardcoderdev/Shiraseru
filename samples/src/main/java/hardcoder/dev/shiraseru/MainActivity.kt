package hardcoder.dev.shiraseru

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import hardcoder.dev.shiraseru.config.*
import hardcoder.dev.shiraseru.databinding.ActivityMainBinding
import hardcoder.dev.shiraseru.snacker.builtIn.SnackerBuiltInActivity
import hardcoder.dev.shiraseru.snacker.builtIn.SnackerBuiltInDSLActivity
import hardcoder.dev.shiraseru.snacker.core.SnackerCoreActivity
import hardcoder.dev.shiraseru.snacker.core.SnackerCoreDSLActivity
import hardcoder.dev.shiraseru.toaster.builtIn.ToasterBuiltInActivity
import hardcoder.dev.shiraseru.toaster.builtIn.ToasterBuiltInDSLActivity
import hardcoder.dev.shiraseru.toaster.core.ToasterCoreActivity
import hardcoder.dev.shiraseru.toaster.core.ToasterCoreDSLActivity
import hardcoder.dev.shiraseru_snackbars_dsl.*
import hardcoder.dev.shiraseru_toasts_built_in.config.*
import hardcoder.dev.shiraseru_toasts_dsl.*

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding<ActivityMainBinding>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpClicks()
    }

    private fun setUpClicks() = with(binding) {
        toastCoreExampleButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, ToasterCoreActivity::class.java))
        }

        toastCoreDslExampleButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, ToasterCoreDSLActivity::class.java))
        }

        toastBuiltInExampleButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, ToasterBuiltInActivity::class.java))
        }

        toastBuiltInDslExampleButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, ToasterBuiltInDSLActivity::class.java))
        }

        snackbarCoreExampleButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, SnackerCoreActivity::class.java))
        }

        snackbarCoreDslExampleButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, SnackerCoreDSLActivity::class.java))
        }

        snackbarBuiltInExampleButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, SnackerBuiltInActivity::class.java))
        }

        snackbarBuiltInDslExampleButton.setOnClickListener {
            startActivity(Intent(this@MainActivity, SnackerBuiltInDSLActivity::class.java))
        }
    }
}