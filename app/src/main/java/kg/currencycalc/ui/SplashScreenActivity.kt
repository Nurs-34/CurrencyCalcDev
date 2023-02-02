package kg.currencycalc.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

import kg.currencycalc.databinding.ActivitySplashScreenBinding



class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)

        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this, CurrencyCalcActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000L)
    }
}
