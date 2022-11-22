package com.example.ambientsounds_app_ui.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = color7,
    primaryVariant = color2,
    secondary = color3,
    background = imgBg,
    secondaryVariant = color8,
    onBackground = color6
)

private val LightColorPalette = lightColors(
    primary = color1,
    primaryVariant = color2,
    secondary = color3,
    background = imgBg,
    secondaryVariant = color8,
    onBackground = color6

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun AmbientSoundsAppUITheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}