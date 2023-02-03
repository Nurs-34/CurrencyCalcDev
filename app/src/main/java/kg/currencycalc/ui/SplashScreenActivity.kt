package kg.currencycalc.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import kg.currencycalc.R

import kg.currencycalc.databinding.ActivitySplashScreenBinding



class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportActionBar?.hide()

        //9306df2651-239eaa439f-rphl2m
        //https://console.fastforex.io/

        Handler().postDelayed({
            val intent = Intent(this, CurrencyCalcActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000L)
    }
}
