package abs.azimjon.grocery.ui.screens.home

import abs.azimjon.grocery.api.model.UserLogin
import abs.azimjon.grocery.ui.screens.login.LoginViewmodel
import android.net.wifi.hotspot2.pps.HomeSp
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun Home(modifier: Modifier = Modifier, viewmodel: HomeViewModel) {
    Box(
        modifier.fillMaxSize(), contentAlignment = Alignment.Center
    ) {
     Text("HOME")
    }
}