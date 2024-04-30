package com.example.rosaapp

import android.net.Uri
import android.widget.MediaController
import android.widget.VideoView
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavHostController
import com.example.rosaapp.ui.theme.BackgroundColor
import com.example.rosaapp.ui.theme.BlackLightCustom

@Composable
fun VideoPlayerScreen(
    navController: NavHostController
) {
    val scrollState = rememberScrollState()
    SetStatusBarColor(color = BackgroundColor)
    Column(
        modifier = Modifier
            .background(BackgroundColor),
    ) {
            VideoPlayer(videoUri = Uri.parse("android.resource://com.example.rosaapp/raw/lv_0_20240429201849"))
    }
}
@Composable
fun VideoPlayer(
    videoUri: Uri
){
    AndroidView(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(BackgroundColor),
        factory = {context->
            VideoView(context).apply {
                setVideoURI(videoUri)

                val myController = MediaController(context)
                myController.setAnchorView(this)
                setMediaController(myController)

                setOnPreparedListener {
                    start()
                }
            }
        })
}