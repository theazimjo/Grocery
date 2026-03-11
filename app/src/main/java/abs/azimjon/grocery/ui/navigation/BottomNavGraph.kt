package abs.azimjon.grocery.ui.navigation

import abs.azimjon.grocery.ui.screens.MainScreen
import abs.azimjon.grocery.ui.screens.account.Account
import abs.azimjon.grocery.ui.screens.cart.Cart
import abs.azimjon.grocery.ui.screens.explore.Explore
import abs.azimjon.grocery.ui.screens.favourite.Favourite
import abs.azimjon.grocery.ui.screens.home.Home
import abs.azimjon.grocery.ui.screens.home.HomeViewModel
import abs.azimjon.grocery.ui.screens.login.Login
import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@SuppressLint("ViewModelConstructorInComposable")
@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(navController, startDestination = "home")
    {
        composable("home") {
            Home(modifier = Modifier, viewmodel = HomeViewModel())
        }
        composable("explore") {
            Explore(modifier = Modifier)
        }
        composable("cart") {
            Cart(modifier = Modifier)
        }
        composable("favourite") {
            Favourite(modifier = Modifier)
        }
        composable("account") {
            Account(modifier = Modifier)
        }
    }
}