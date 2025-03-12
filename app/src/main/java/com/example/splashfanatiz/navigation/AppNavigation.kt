package com.example.splashfanatiz.navigation

import androidx.compose.runtime.Composable

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.splashfanatiz.ui.screen.FanatizScreen
import com.example.splashfanatiz.ui.screen.MainScreen
import com.example.splashfanatiz.ui.screen.SplashScreen

@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppScreens.SplashScreen.router
    ) {
        composable(AppScreens.SplashScreen.router) {
            SplashScreen(navController)
        }
        composable(AppScreens.MainScreen.router) {
            MainScreen()
        }
        composable(AppScreens.FanatizScreen.router) {
            FanatizScreen()
        }
    }

}