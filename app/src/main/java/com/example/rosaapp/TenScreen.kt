package com.example.rosaapp

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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.rosaapp.ui.theme.BackgroundColor
import com.example.rosaapp.ui.theme.BlackCustom
import com.example.rosaapp.ui.theme.BlackLightCustom
import com.example.rosaapp.ui.theme.Green

@Composable
fun TenScreen(
    navController: NavHostController
) {
    val scrollState = rememberScrollState()
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
                painter = painterResource(id = R.drawable.image_32),
                contentDescription = ""
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier.padding(horizontal = 30.dp),
            text = "Você é muito linda",
            style = MaterialTheme.typography.bodyLarge,
            color = BlackCustom
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            modifier = Modifier.padding(horizontal = 30.dp),
            text = "Jurooooo! não aguento com tanta beleza. GOSTOSA, PERFEITA, MARAVILHOSA, CHEIROSA(mentira), LINDAAAAAA",
            style = MaterialTheme.typography.titleLarge,
            color = BlackLightCustom
        )
        Spacer(modifier = Modifier.height(40.dp))
        Button(
            onClick = {
                navController.navigate(Graph.ELEVEN_SCREEN)
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
                text = "Avançar",
                style = MaterialTheme.typography.titleLarge,
                color = Color.White
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
    }
}