package com.example.rosaapp

import android.app.Activity
import android.os.Bundle
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.rosaapp.ui.theme.BackgroundColor
import com.example.rosaapp.ui.theme.BlackCustom
import com.example.rosaapp.ui.theme.BlackLightCustom
import com.example.rosaapp.ui.theme.Green
import com.google.firebase.analytics.FirebaseAnalytics

@Composable
fun FourteenScreen(
    navController: NavHostController
) {
    val scrollState = rememberScrollState()
    val activity = (LocalContext.current as? Activity)

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
                painter = painterResource(id = R.drawable.image_31),
                contentDescription = ""
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier.padding(horizontal = 30.dp),
            text = "Quer namorar comigo é?",
            style = MaterialTheme.typography.bodyLarge,
            color = BlackCustom
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier.padding(horizontal = 30.dp),
            text = "Pois eu não quero, eu nem te conheço, pare de ser maluca! \n" +
                    "A\n" +
                    "COR\n" +
                    "DE",
            style = MaterialTheme.typography.titleLarge,
            color = BlackLightCustom
        )
        Spacer(modifier = Modifier.height(40.dp))
        Button(
            onClick = {
                activity?.finish()
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
                text = "Fim",
                style = MaterialTheme.typography.titleLarge,
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
    }

}
