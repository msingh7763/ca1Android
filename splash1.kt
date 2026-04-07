package com.example.firstca

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstca.ui.theme.FirstcaTheme

class splash1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstcaTheme {
                SplashScreen()

            }
        }
    }
}

@Composable

fun SplashScreen(navController: NavController) {
    LaunchedEffect(true) {
        kotlinx.coroutines.delay(2000) // 2 sec delay
        navController.navigate("dashboard")
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Smart Learning App", fontSize = 24.sp)
            Spacer(modifier = Modifier.height(20.dp))
            CircularProgressIndicator()
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    FirstcaTheme {
        Greeting2("Android")
    }
}