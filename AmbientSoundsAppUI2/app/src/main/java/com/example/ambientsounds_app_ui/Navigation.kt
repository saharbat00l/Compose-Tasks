package com.example.ambientsounds_app_ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController


@Composable
fun Navigation(){
    val navController = rememberNavController()

    NavHost(navController = navController,
        startDestination = Screen.MainScreen.route)
    {

        composable(route= Screen.MainScreen.route)
        { MainScreen(navController = navController) }

        composable(route= Screen.SignUpScreen.route)
        { SignUpScreen(navController = navController) }

    }

}
