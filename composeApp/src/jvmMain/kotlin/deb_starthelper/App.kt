package deb_starthelper

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import deb_starthelper.theme.AppTypography
import org.jetbrains.compose.ui.tooling.preview.Preview
import deb_starthelper.theme.ColorTheme
import deb_starthelper.theme.myShape

val row1Width = 200.dp

@Composable
@Preview
fun spacer(width: Int = 0, height: Int = 0){
    Box(modifier = Modifier.size(width.dp, height.dp)){}
}

@Composable
@Preview
fun App() {
    MaterialTheme(colorScheme = ColorTheme().darkTheme, typography = AppTypography, shapes = myShape) {
        Surface() {
            Column(Modifier.fillMaxSize().padding(horizontal = 10.dp, vertical = 5.dp)) {

                Box(Modifier.align(Alignment.CenterHorizontally)){
                    Text("deb-startHelper", fontSize = 30.sp, color = Color.White)
                    Spacer(Modifier.height(75.dp))
                }

                SharpButton(onClick = {deb_starthelper.logic.enableContribNonfree()}, Modifier.fillMaxWidth()) {
                    Row(Modifier.fillMaxWidth()){Text("Switch to normal Firefox")}
                }

                SharpButton(onClick = {deb_starthelper.logic.enableContribNonfree()}, Modifier.fillMaxWidth()) {
                    Row(Modifier.fillMaxWidth()){Text("Install Taskbar (Gnome)")}
                }

                SharpButton(onClick = {deb_starthelper.logic.enableContribNonfree()}, Modifier.fillMaxWidth()) {
                    Row(Modifier.fillMaxWidth()){Text("Enable contrib+nonfree repos")}
                }

                SharpButton(onClick = {deb_starthelper.logic.installRustSDK()}, Modifier.fillMaxWidth()) {
                    Row(Modifier.fillMaxWidth()){Text("Install latest backports Kernel")}
                }

                SharpButton(onClick = {}, Modifier.fillMaxWidth()) {
                    Row(Modifier.fillMaxWidth()){Text("Install Flatpak+Flathub")}
                }

                SharpButton(onClick = {}, Modifier.fillMaxWidth()) {
                    Row(Modifier.fillMaxWidth()){Text("Install Kotlin-SDK (Snap)")}
                }


            }
        }
    }
}

