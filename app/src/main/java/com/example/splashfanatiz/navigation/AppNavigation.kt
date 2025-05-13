package com.example.splashfanatiz.navigation

import androidx.compose.runtime.Composable

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.splashfanatiz.ui.screen.CardScreen
import com.example.splashfanatiz.ui.screen.FanatizScreen
import com.example.splashfanatiz.ui.screen.LoginScreen
import com.example.splashfanatiz.ui.screen.MainScreen
import com.example.splashfanatiz.ui.screen.NotificationsScreen
import com.example.splashfanatiz.ui.screen.RegisterScreen
import com.example.splashfanatiz.ui.screen.RegisterSocialMediaScreen
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
            FanatizScreen(navController)
        }
        composable(AppScreens.RegisterScreen.router) {
            RegisterScreen()
        }
        composable(AppScreens.RegisterSocialMediaScreen.router) {
            RegisterSocialMediaScreen(navController)
        }
        composable(AppScreens.NotificationsScreen.router) {
            NotificationsScreen()
        }
        composable(AppScreens.LoginScreen.router) {
            LoginScreen()
        }
        composable(AppScreens.CardScreen.router) {
            CardScreen()
        }
    }

}