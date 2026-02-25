package abs.azimjon.grocery.api.`interface`

import abs.azimjon.grocery.api.model.UserInfo
import abs.azimjon.grocery.api.model.UserLogin
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginInterface {
    @POST("auth/login")
    suspend fun Login(@Body user: UserLogin): UserInfo
}