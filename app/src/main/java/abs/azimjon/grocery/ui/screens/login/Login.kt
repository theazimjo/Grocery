package abs.azimjon.grocery.ui.screens.login

import abs.azimjon.grocery.api.model.UserLogin
import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.Navigator
import kotlinx.coroutines.launch

@Composable
fun Login(modifier: Modifier = Modifier, viewmodel: LoginViewmodel, navigator: NavController) {

//    statelar
    var username by remember { mutableStateOf("emilys") }
    var password by remember { mutableStateOf("emilyspass") }
    var expiresInMins by remember { mutableStateOf(30) }
    var status by remember { mutableStateOf("") }
    var scope = rememberCoroutineScope()

    Box(
        modifier.fillMaxSize(), contentAlignment = Alignment.Center
    ) {
        Column(
            modifier.fillMaxWidth(0.8f)
        ) {
            TextField(
                value = username,
                onValueChange = { newUsername ->
                    username = newUsername
                },
                label = { Text("Username") }
            )
            Spacer(modifier.height(25.dp))

            TextField(
                value = password,
                onValueChange = { newpassword ->
                    password = newpassword
                },
                label = { Text("Password") }
            )

            Text(status)
            Spacer(modifier.height(25.dp))

            Button(
                onClick = {
//                    Asosiy login qismi
                    scope.launch {
                        try {
                            navigator.navigate("home")
                            viewmodel.login(UserLogin(username, password, expiresInMins))
                            status = "Succes"
                        } catch (e: Exception) {
                            status = "Login or Password wrong!"

                        }
                    }
                }
            ) {
                Text("Login")
            }

        }
    }

}