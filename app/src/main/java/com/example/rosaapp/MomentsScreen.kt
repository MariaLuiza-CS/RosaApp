package com.example.rosaapp

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.rosaapp.ui.theme.BackgroundColor


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MomentsScreen(
    navController: NavHostController
) {
    val items = mutableListOf(
        R.drawable.whatsapp_image_2024_04_29_at_16_00_31,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_31__1_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_31__2_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_32,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_32__1_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_32__2_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_32__3_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_33,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_33__1_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_33__2_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_34,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_34__1_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_34__2_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_34__3_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_35,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_35__1_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_35__2_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_36,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_36__1_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_36__2_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_37,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_37__1_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_38,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_38__1_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_40,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_41,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_42,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_43,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_43__1_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_44,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_44__1_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_45,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_45__1_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_46,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_46__1_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_47,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_47__1_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_48,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_48__1_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_48__2_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_49,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_49__1_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_49__2_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_50,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_50__1_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_50__2_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_51,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_51__1_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_51__2_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_52,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_52__1_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_52__2_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_52__3_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_53,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_53__1_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_54,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_54__1_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_55,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_55__1_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_55__2_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_56,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_56__1_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_56__2_,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_57,
        R.drawable.whatsapp_image_2024_04_29_at_16_00_57__1_
    )

    SetStatusBarColor(color = BackgroundColor)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BackgroundColor)
    ) {
        LazyVerticalStaggeredGrid(
            columns = StaggeredGridCells.Fixed(2)
        ) {
            items(items) {
                RandomColorBox(item = it, navController)
            }
        }
    }
}

@Composable
fun RandomColorBox(
    item: Int,
    navController: NavHostController
) {
    Image(
        painter = painterResource(id = item),
        contentDescription = "stringResource(id = R.string.dog_content_description)",
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .padding(16.dp)
            .clickable {
                Graph.imageGlobal = item
                navController.navigate(Graph.IMAGE_VIEW_SCREEN)
            }
    )
}