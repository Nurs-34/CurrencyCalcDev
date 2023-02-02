/*
package kg.currencycalc.repository

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import java.util.*


    @Entity(tableName = "currency")
    data class CurrencyEntity(
        @PrimaryKey
        val id: Long = 0,

        val title: String,
        val subTitle: String,


    ) {
        @Ignore
        constructor(atm: CurrencyModel) : this(
            id = atm.id,
            title = atm.title,
            city = atm.city,
            address = atm.address,
            type = atm.type.lowercase(Locale.getDefault()),
            lat = atm.position.lat,
            lng = atm.position.lng,
            bank_id = atm.bank.bid,
            bank_title = atm.bank.title,
            bid = atm.bid
        )
    }
*/
