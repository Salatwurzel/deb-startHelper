package deb_starthelper.logic

import java.io.File

fun installFlathub(){
    var commands = mutableListOf(
        "sudo apt update",
        "sudo apt install flatpak -y",
        "flatpak remote-add --if-not-exists flathub https://flathub.org/repo/flathub.flatpakrepo"
    )

    if (File("/usr/bin/gnome-software").exists()){
        commands.add("sudo apt install gnome-software-plugin-flatpak -y")
    }

    runShellCommands(commands)
}