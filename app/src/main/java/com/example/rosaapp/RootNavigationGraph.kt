package com.example.rosaapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun RootNavigationGraph(
    navController: NavHostController,
    startDestination: String
) {
    NavHost(
        navController = navController,
        route = Graph.ROOT,
        startDestination = startDestination
    ) {
        composable(route =  Graph.HOME_SCREEN){
            HomeScreen(navController)
        }
        composable(route =  Graph.FEELING_SCREEN){
            FeelingScreen(navController)
        }
        composable(route =  Graph.MOMENTS_SCREEN){
            MomentsScreen(navController)
        }
        composable(route =  Graph.IMAGE_VIEW_SCREEN){
            ImageViewScreen(navController, Graph.imageGlobal)
        }
        composable(route =  Graph.VIDEO_PLAYER_SCREEN){
            VideoPlayerScreen(navController)
        }
    }
}

object Graph {
    internal var imageGlobal: Int = R.drawable.image_25
    const val ROOT = "root_graph"
    const val HOME_SCREEN = "HOME_SCREEN"
    const val FEELING_SCREEN = "FEELING_SCREEN"
    const val MOMENTS_SCREEN = "MOMENTS_SCREEN"
    const val IMAGE_VIEW_SCREEN = "IMAGE_VIEW_SCREEN"
    const val VIDEO_PLAYER_SCREEN = "VIDEO_PLAYER_SCREEN"
}