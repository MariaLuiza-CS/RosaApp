package com.example.rosaapp

import android.app.Activity
import android.content.ContentValues
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import androidx.navigation.NavHostController
import com.example.rosaapp.ui.theme.BackgroundColor
import com.example.rosaapp.ui.theme.BlackLightCustom
import com.example.rosaapp.ui.theme.Green
import com.example.rosaapp.ui.theme.Peach
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth


@Composable
fun HomeScreen(
    navController: NavHostController
) {
    val scrollState = rememberScrollState()
    var auth: FirebaseAuth = com.google.firebase.ktx.Firebase.auth
    val currentUser = auth.currentUser
    val activity = (LocalContext.current as? Activity)
    SetStatusBarColor(color = Peach)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundColor)
            .verticalScroll(state = scrollState),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(BackgroundColor)
        ) {
            auth.signInAnonymously()
                .addOnCompleteListener(activity!!) { task ->
                    if (task.isSuccessful) {
                        // Sign in success, update UI with the signed-in user's information
                        Log.d(ContentValues.TAG, "signInAnonymously:success")
                        val user = auth.currentUser
                    } else {
                        // If sign in fails, display a message to the user.
                        Log.w(ContentValues.TAG, "signInAnonymously:failure", task.exception)
                    }
                }

            Card(
                shape = RoundedCornerShape(
                    topStart = 0.dp,
                    topEnd = 0.dp,
                    bottomEnd = 30.dp,
                    bottomStart = 30.dp
                ),
                colors = CardDefaults.cardColors(
                    containerColor = Peach
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(125.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        modifier = Modifier.padding(horizontal = 30.dp),
                        text = "App da Rosy",
                        style = MaterialTheme.typography.titleLarge,
                        color = BlackLightCustom
                    )
                }
            }

            Spacer(modifier = Modifier.height(40.dp))

            Image(
                painter = painterResource(id = R.drawable.rosa_img),
                contentDescription = "stringResource(id = R.string.dog_content_description)",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(20.dp))
                    .padding(30.dp)
            )

            Spacer(modifier = Modifier.height(40.dp))

            Text(
                modifier = Modifier.padding(start = 30.dp),
                text = "Menu da boiolisse",
                style = MaterialTheme.typography.titleLarge,
                color = BlackLightCustom
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    navController.navigate(Graph.FEELING_SCREEN)
                },
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(horizontal = 30.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Green,
                    containerColor = Green
                )
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        modifier = Modifier.padding(start = 16.dp),
                        text = "Sentimento",
                        style = MaterialTheme.typography.titleLarge,
                        color = Color.White
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_arrow_forward_ios_24),
                        modifier = Modifier.size(30.dp),
                        contentDescription = "drawable icons",
                        tint = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    navController.navigate(Graph.MOMENTS_SCREEN)
                },
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(horizontal = 30.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Green,
                    containerColor = Green
                )
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        modifier = Modifier.padding(start = 16.dp),
                        text = "Momentos",
                        style = MaterialTheme.typography.titleLarge,
                        color = Color.White
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_arrow_forward_ios_24),
                        modifier = Modifier.size(30.dp),
                        contentDescription = "drawable icons",
                        tint = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    navController.navigate(Graph.VIDEO_PLAYER_SCREEN)
                },
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp)
                    .padding(horizontal = 30.dp),
                colors = ButtonDefaults.buttonColors(
                    contentColor = Green,
                    containerColor = Green
                )
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        modifier = Modifier.padding(start = 16.dp),
                        text = "Blog da Rosy",
                        style = MaterialTheme.typography.titleLarge,
                        color = Color.White
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_arrow_forward_ios_24),
                        modifier = Modifier.size(30.dp),
                        contentDescription = "drawable icons",
                        tint = Color.White
                    )
                }
            }
        }
    }
}
