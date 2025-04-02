package com.example.splashfanatiz.navigation

import android.media.MediaRouter

sealed class AppScreens(val router: String) {
    object MainScreen : AppScreens("main_screen")
    object SplashScreen : AppScreens ("splash_screen")
    object FanatizScreen: AppScreens ("fanatiz_screen")
    object RegisterSocialMediaScreen: AppScreens ("register_screen")
    object LoginScreen: AppScreens ("login_screen")
    object RegisterScreen: AppScreens ("register1_screen")

}

