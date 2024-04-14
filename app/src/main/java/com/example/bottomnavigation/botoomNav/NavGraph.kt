package com.example.bottomnavigation.botoomNav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(navController =navHostController , startDestination = "screen_Shelf"){
        composable("screen_Shelf"){
            Shelf()
        }
        composable("screen_User"){
            User()
        }
        composable("screen_Settings"){
            Settings()
        }

    }
}