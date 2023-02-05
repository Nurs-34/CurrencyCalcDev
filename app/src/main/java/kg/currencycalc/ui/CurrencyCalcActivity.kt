package kg.currencycalc.ui


import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import kg.currencycalc.R
import kg.currencycalc.databinding.ActivityCurrecyCalcBinding

class CurrencyCalcActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCurrecyCalcBinding
    private lateinit var vm: CurrencyCalcViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCurrecyCalcBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        vm = ViewModelProvider(this)[CurrencyCalcViewModel::class.java]

    }
}


/*
/fetch-multi?from=USD&to=EUR,GBP,CNY,RUB,KGS,KZT,USD

9306df2651-239eaa439f-rphl2m

https://api.fastforex.io/fetch-multi?from=USD&to=EUR,GBP,CNY,RUB,KGS,KZT,USD&api_key=9306df2651-239eaa439f-rphl2m*/