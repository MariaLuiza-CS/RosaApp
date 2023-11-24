package com.example.rosaapp

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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.navigation.NavHostController
import com.example.rosaapp.ui.theme.BackgroundColor
import com.example.rosaapp.ui.theme.BlackCustom
import com.example.rosaapp.ui.theme.BlackLightCustom
import com.example.rosaapp.ui.theme.Blue
import com.example.rosaapp.ui.theme.Green
import com.google.firebase.Firebase
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.analytics
import com.google.firebase.analytics.logEvent

@Composable
fun ThirteenScreen(
    navController: NavHostController
) {
    val scrollState = rememberScrollState()
    var isClicked by remember { mutableStateOf(false) }
    var firebaseAnalytics: FirebaseAnalytics = Firebase.analytics

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundColor)
            .verticalScroll(state = scrollState),
        verticalArrangement = Arrangement.Bottom
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                modifier = Modifier.padding(30.dp),
                painter = painterResource(id = R.drawable.image_29),
                contentDescription = ""
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier.padding(horizontal = 30.dp),
            text = "Aceita namorar comigo?",
            style = MaterialTheme.typography.bodyLarge,
            color = BlackCustom
        )
        Spacer(modifier = Modifier.height(40.dp))
        Button(
            onClick = {
                navController.navigate(Graph.FOURTEEN_SCREEN)
                firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM) {
                    param(FirebaseAnalytics.Param.ITEM_NAME, "button_yes")
                }

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
            Text(
                modifier = Modifier.padding(start = 16.dp),
                text = "Sim",
                style = MaterialTheme.typography.titleLarge,
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                isClicked = true
                firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SELECT_ITEM) {
                    param(FirebaseAnalytics.Param.ITEM_NAME, "button_nop")
                }
            },
            shape = RoundedCornerShape(12.dp),
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .padding(horizontal = 30.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Blue,
                containerColor = Blue
            )
        ) {
            Text(
                modifier = Modifier.padding(start = 16.dp),
                text = "Não",
                style = MaterialTheme.typography.titleLarge,
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
    }

    if (isClicked) {
        Dialog(
            onDismissRequest = {
                isClicked = false
            },
            properties = DialogProperties(
                usePlatformDefaultWidth = false
            )
        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(375.dp)
                    .padding(16.dp),
                shape = RoundedCornerShape(16.dp),
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.image_30),
                        contentDescription = "teste",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .height(160.dp)
                    )
                    Spacer(modifier = Modifier.height(20.dp))

                    if (isSystemInDarkTheme()) {
                        Text(
                            modifier = Modifier.padding(horizontal = 30.dp),
                            text = "Não acredito!!!!!\n" +
                                    "Pare de reprimir os seus sentimentos, isso não faz bem para vc.",
                            style = MaterialTheme.typography.labelSmall,
                            color = Color.White
                        )
                    } else {
                        Text(
                            modifier = Modifier.padding(horizontal = 30.dp),
                            text = "Não acredito!!!!!\n" +
                                    "Pare de reprimir os seus sentimentos, isso não faz bem para vc.",
                            style = MaterialTheme.typography.labelSmall,
                            color = BlackLightCustom
                        )
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center,
                    ) {
                        TextButton(
                            onClick = { isClicked = false },
                            modifier = Modifier.padding(8.dp),
                            colors = ButtonDefaults.buttonColors(
                                contentColor = Green,
                            ),
                        ) {
                            Text(
                                text = "Cancelar",
                                style = MaterialTheme.typography.labelSmall,
                                color = Color.White
                            )
                        }
                        TextButton(
                            onClick = { isClicked = false },
                            modifier = Modifier.padding(8.dp),
                            colors = ButtonDefaults.buttonColors(
                                contentColor = Green
                            ),
                        ) {
                            Text(
                                text = "Voltar",
                                style = MaterialTheme.typography.labelSmall,
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }
    }
}