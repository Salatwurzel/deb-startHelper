package deb_starthelper

import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import java.time.LocalDateTime
import kotlin.system.exitProcess

const val version = "0.1"

fun main() = application {
    println(LocalDateTime.now().toString() + " - Application started")
    Window(
        onCloseRequest = {exitProcess(0)},
        title = "deb-StartHelper",
        state = WindowState(width = 325.dp, height = 415.dp)
    ){
        App()
    }
}