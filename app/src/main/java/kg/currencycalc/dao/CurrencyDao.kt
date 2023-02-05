package kg.currencycalc.dao

import androidx.room.Dao
import androidx.room.Insert
import kg.currencycalc.entity.Currency

@Dao
interface CurrencyDao {

    @Insert
    fun insertPokemon(currency: Currency)

}