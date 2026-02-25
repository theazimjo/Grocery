package abs.azimjon.grocery

import abs.azimjon.grocery.ui.navigation.NavGraph
import abs.azimjon.grocery.ui.screens.login.Login
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import abs.azimjon.grocery.ui.theme.GroceryTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GroceryTheme {

                var navcontroller = rememberNavController()

                NavGraph(modifier = Modifier, navController = navcontroller)
            }
        }
    }
}
