package hardcoder.dev.shiraseru_samples

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import by.kirich1409.viewbindingdelegate.viewBinding
import hardcoder.dev.shiraseru_samples.databinding.ActivityMainBinding
import hardcoder.dev.shiraseru_samples.snacker.builtIn.SnackerBuiltInActivity
import hardcoder.dev.shiraseru_samples.snacker.builtIn.SnackerBuiltInDSLActivity
import hardcoder.dev.shiraseru_samples.snacker.core.SnackerCoreActivity
import hardcoder.dev.shiraseru_samples.snacker.core.SnackerCoreDSLActivity
import hardcoder.dev.shiraseru_samples.toaster.builtIn.ToasterBuiltInActivity
import hardcoder.dev.shiraseru_samples.toaster.builtIn.ToasterBuiltInDSLActivity
import hardcoder.dev.shiraseru_samples.toaster.core.ToasterCoreActivity
import hardcoder.dev.shiraseru_samples.toaster.core.ToasterCoreDSLActivity

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