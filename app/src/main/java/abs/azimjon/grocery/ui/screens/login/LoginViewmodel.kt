package abs.azimjon.grocery.ui.screens.login

import abs.azimjon.grocery.api.RetrofitClient
import abs.azimjon.grocery.api.model.UserInfo
import abs.azimjon.grocery.api.model.UserLogin
import androidx.lifecycle.ViewModel
import kotlin.math.log

class LoginViewmodel : ViewModel() {

    suspend fun login(user: UserLogin): UserInfo {
        var login = RetrofitClient.api.Login(user)
        return login
    }
}