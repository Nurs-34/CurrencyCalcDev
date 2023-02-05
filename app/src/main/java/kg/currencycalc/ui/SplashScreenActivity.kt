package kg.currencycalc.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import kg.currencycalc.R

import kg.currencycalc.databinding.ActivitySplashScreenBinding

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding
    private lateinit var viewModel: SplashScreenViewModel
    val apiKey = "&api_key=9306df2651-239eaa439f-rphl2m"
    var firstCurrency = "USD"
    var secondCurrency = "KGS"
    val currencyString = "?from=$firstCurrency&to=EUR,GBP,CNY,RUB,KGS,KZT,USD"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        viewModel = ViewModelProvider(this)[SplashScreenViewModel::class.java]

        supportActionBar?.hide()

        viewModel.getQuote(currencyString + apiKey)



        Handler().postDelayed({
            val intent = Intent(this, CurrencyCalcActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000L)
    }
}
