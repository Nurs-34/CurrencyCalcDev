package kg.currencycalc.ui

import androidx.lifecycle.ViewModel
import kg.currencycalc.utils.RestApiInterface

class SplashScreenViewModel: ViewModel() {

    fun getQuote(url: String){
        RestApiInterface.instance.getCurrencyQuote(url)
    }
}