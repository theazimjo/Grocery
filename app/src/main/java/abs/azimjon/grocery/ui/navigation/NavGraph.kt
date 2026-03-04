package abs.azimjon.grocery.ui.navigation

import abs.azimjon.grocery.ui.screens.home.Home
import abs.azimjon.grocery.ui.screens.login.Login
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun NavGraph(modifier: Modifier = Modifier, navController: NavHostController) {

    NavHost(navController, startDestination = "login")
    {
        composable("login") {
            Login(modifier, viewModel(), navController)
        }

        composable("home") {
            Home(modifier, viewModel())
        }
    }
}