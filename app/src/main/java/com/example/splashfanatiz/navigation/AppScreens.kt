package com.example.splashfanatiz.navigation

sealed class AppScreens(val router: String) {
    object MainScreen : AppScreens("main_screen")
    object SplashScreen : AppScreens ("splash_screen")
    object FanatizScreen: AppScreens ("fanatiz_screen")
    object RegisterSocialMediaScreen: AppScreens ("register_social_media_screen")
    object LoginScreen: AppScreens ("login_screen")
    object RegisterScreen: AppScreens ("register_screen")
    object NotificationsScreen: AppScreens ("notificaciones_screen")
    object CardScreen: AppScreens ("card_screen")
}

