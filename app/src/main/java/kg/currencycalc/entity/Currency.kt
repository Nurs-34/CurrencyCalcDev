package kg.currencycalc.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey


@Entity(tableName = "currency")
class Currency(
    @PrimaryKey(autoGenerate = true)
    val uid: Int,

    @ColumnInfo(name = "currency_name")
    val base: String,
    @Ignore
    val result: List<CurrencyQuotes>,
    @ColumnInfo(name = "update_date")
    val update: String
) {

    @Entity(tableName = "currency")
    class CurrencyQuotes(
        val EUR: Double,
        val GBP: Double,
        val CNY: Double,
        val RUB: Double,
        val KGS: Double,
        val KZT: Double,
        val USD: Double
    )
}


