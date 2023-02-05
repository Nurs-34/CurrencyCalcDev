package kg.currencycalc.utils

import kg.currencycalc.entity.Currency
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.Url

interface RestApiInterface {
    @GET("/fetch-multi")
     fun getCurrencyQuote(@Query("url") url: String): Call<Currency>



     companion object RetrofitClient {

         private const val BASE_URL = "https://api.fastforex.io/"

         private val okHttpClient = OkHttpClient.Builder()
             .addInterceptor { chain ->
                 val original = chain.request()

                 val requestBuilder = original.newBuilder()
                     .method(original.method, original.body)

                 val request = requestBuilder.build()
                 chain.proceed(request)
             }.build()

         val instance: RestApiInterface by lazy{
             val retrofit = Retrofit.Builder()
                 .baseUrl(BASE_URL)
                 .addConverterFactory(GsonConverterFactory.create())
                 .client(okHttpClient)
                 .build()

             retrofit.create(RestApiInterface::class.java)
         }
     }
}


