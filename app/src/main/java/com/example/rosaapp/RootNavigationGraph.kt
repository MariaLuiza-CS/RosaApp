package com.example.rosaapp

import androidx.compose.animation.ExperimentalAnimationApi
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
        composable(route =  Graph.FIRST_SCREEN){
            FirstScreen(navController)
        }
        composable(route =  Graph.SECOND_SCREEN){
            SecondScreen(navController)
        }
        composable(route =  Graph.THIRD_SCREEN){
            ThirdScreen(navController)
        }
        composable(route =  Graph.FOURTH_SCREEN){
            FourScreen(navController)
        }
        composable(route =  Graph.FIVE_SCREEN){
            FiveScreen(navController)
        }
        composable(route =  Graph.SIX_SCREEN){
            SixScreen(navController)
        }
        composable(route =  Graph.SEVEN_SCREEN){
            SevenScreen(navController)
        }
    }
}

object Graph {
    const val ROOT = "root_graph"
    const val FIRST_SCREEN = "FIRST_SCREEN"
    const val SECOND_SCREEN = "SECOND_SCREEN"
    const val THIRD_SCREEN = "THIRD_SCREEN"
    const val FOURTH_SCREEN = "FOURTH_SCREEN"
    const val FIVE_SCREEN = "FIVE_SCREEN"
    const val SIX_SCREEN = "SIX_SCREEN"
    const val SEVEN_SCREEN = "SEVEN_SCREEN"
}