package deb_starthelper.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextMotion
import androidx.compose.ui.unit.sp
import deb_starthelper.composeapp.generated.resources.JetBrainsMono_Bold
import deb_starthelper.composeapp.generated.resources.JetBrainsMono_Medium
import deb_starthelper.composeapp.generated.resources.JetBrainsMono_Regular
import deb_starthelper.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.ui.tooling.preview.Preview

val AppTypography @Composable get() = Typography(
    displayLarge = TextStyle(color = Color.White),
    displayMedium = TextStyle(color = Color.White, ),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White)
)

val Typography1 @Composable get() = Typography(
        displayLarge = TextStyle(
            fontFamily = FontFamily(Font(Res.font.JetBrainsMono_Regular))
        )
    )

@Composable
@Preview
fun jojo(): FontFamily{
    val f = FontFamily(Font(Res.font.JetBrainsMono_Regular))
    return f
}

val optionsTypography @Composable get() = Typography(
    displayLarge = TextStyle(color = Color.White),
    displayMedium = TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White, fontFamily = FontFamily(Font(Res.font.JetBrainsMono_Medium)), fontSize = 13.sp),
    TextStyle(color = Color.White),
    TextStyle(color = Color.White)
)