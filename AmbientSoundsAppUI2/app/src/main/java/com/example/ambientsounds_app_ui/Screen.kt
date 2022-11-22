package com.example.ambientsounds_app_ui

sealed class Screen( val route:String){
    object MainScreen: Screen("main_screen")
    object SignUpScreen: Screen("signup_screen")
}
