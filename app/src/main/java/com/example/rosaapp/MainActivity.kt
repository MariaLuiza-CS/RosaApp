package com.example.rosaapp

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.rosaapp.ui.theme.RosaAppTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth

class MainActivity : ComponentActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = com.google.firebase.ktx.Firebase.auth
        setContent {
            RosaAppTheme {
                val currentUser = auth.currentUser
                SetStatusBarColor(color = MaterialTheme.colorScheme.primary)
                auth.signInAnonymously()
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            Log.d(TAG, "signInAnonymously:success")
                            val user = auth.currentUser
                        } else {
                            Log.w(TAG, "signInAnonymously:failure", task.exception)
                        }
                    }
                val navController = rememberNavController()
                RootNavigationGraph(
                    navController = navController,
                    startDestination = Graph.HOME_SCREEN
                )
            }
        }
    }
}
@Composable
fun SetStatusBarColor(color: Color) {
    val systemUiController = rememberSystemUiController()
    SideEffect {
        systemUiController.setSystemBarsColor(color)
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    RosaAppTheme {
        Greeting("Android")
    }
}