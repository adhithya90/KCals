package theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = Blue,
    secondary = Teal,
    background = DarkBlue,
    onBackground = Color.White,
    surface = BlueAlpha,
    onSurface = Blue,
    onPrimary = Color.White,
    onSecondary = TealAlpha,


)

private val LightColorPalette = lightColors(
    primary = Blue,
    secondary = Teal,
    background = Color.White,
    onBackground = DarkBlue,
    surface = BlueAlpha,
    onSurface = Blue,
    onPrimary = Color.White,
    onSecondary = TealAlpha,




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
fun KCalsTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
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