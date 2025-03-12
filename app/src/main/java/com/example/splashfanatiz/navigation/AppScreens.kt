package com.example.splashfanatiz.navigation

import android.media.MediaRouter

sealed class AppScreens(val router: String) {
    object MainScreen : AppScreens("main_screen")
    object SplashScreen : AppScreens ("splash_screen")
    object FanatizScreen: AppScreens ("fanatiz_screen")
    object RegisterScreen: AppScreens ("register_screen")

}

