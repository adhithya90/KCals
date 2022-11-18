package theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp


// Set of Material typography styles to start with

val figtree = FontFamily(
    Font(com.example.core.R.font.figtreebold),
    Font(com.example.core.R.font.figtreeblack),
    Font(com.example.core.R.font.figreelight),
    Font(com.example.core.R.font.figtreemedium),
    Font(com.example.core.R.font.figtreeblack),
    Font(com.example.core.R.font.figtreeregular)
)

val Typography = Typography(
    body1 = TextStyle(
        fontFamily = figtree,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    h1 = TextStyle(
        fontFamily = figtree,
        fontWeight = FontWeight.Black,
        fontSize = 20.sp
    )

    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)