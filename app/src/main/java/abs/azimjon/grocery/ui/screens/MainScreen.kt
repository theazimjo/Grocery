package abs.azimjon.grocery.ui.screens

import abs.azimjon.grocery.ui.navigation.BottomNavGraph
import abs.azimjon.grocery.ui.screens.home.Home
import abs.azimjon.grocery.ui.screens.home.HomeViewModel
import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "ViewModelConstructorInComposable")
@Composable
fun MainScreen(modifier: Modifier = Modifier) {

    var bottomNavController = rememberNavController()
    var currentScreen by remember { mutableIntStateOf(1) }

    Scaffold(
        bottomBar = {
            NavigationBar() {
                NavigationBarItem(
                    selected = currentScreen == 1,
                    onClick = {
                        currentScreen = 1
                        bottomNavController.navigate("home")
                    },
                    icon = {
                        Icon(Icons.Default.Home, contentDescription = "icon")
                    },
                    label = {
                        Text("Shop")
                    }
                )
                NavigationBarItem(
                    selected = currentScreen == 2,
                    onClick = {
                        currentScreen = 2
                        bottomNavController.navigate("explore")
                    },
                    icon = {
                        Icon(Icons.Default.Search, contentDescription = "explore")
                    },
                    label = {
                        Text("Explore")
                    }
                )
                NavigationBarItem(
                    selected = currentScreen == 3,
                    onClick = {
                        currentScreen = 3
                        bottomNavController.navigate("cart")
                    },
                    icon = {
                        Icon(Icons.Default.ShoppingCart, contentDescription = "Cart")
                    },
                    label = {
                        Text("Cart")
                    }
                )
                NavigationBarItem(
                    selected = currentScreen == 4,
                    onClick = {
                        currentScreen = 4
                        bottomNavController.navigate("favourite")
                    },
                    icon = {
                        Icon(Icons.Default.Favorite, contentDescription = "Favourite")
                    },
                    label = {
                        Text("Favourite")
                    }
                )
                NavigationBarItem(
                    selected = currentScreen == 5,
                    onClick = {
                        currentScreen = 5
                        bottomNavController.navigate("account")
                    },
                    icon = {
                        Icon(Icons.Default.Person, contentDescription = "Account")
                    },
                    label = {
                        Text("Account")
                    }
                )
            }
        }
    ) { paddingValues ->
        Box(modifier.padding(paddingValues)) {
            BottomNavGraph(bottomNavController)
        }
    }

}