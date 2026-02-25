package abs.azimjon.grocery.api

import abs.azimjon.grocery.api.`interface`.LoginInterface
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    const val BASE_URL = "https://dummyjson.com/"

    var api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(LoginInterface::class.java)
}