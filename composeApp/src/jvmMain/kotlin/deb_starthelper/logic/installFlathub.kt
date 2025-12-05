package deb_starthelper.logic

import java.io.File

fun installFlathub(){
    var messageBeforeStart = listOf<String>(
        "---------------------------------",
        "Going to install Flatpak and add the Flathub repository.",
        "If Gnome-Software is installed, it will also be configured to support Flatpak.",
        "---------------------------------",
        "",
        "Press Enter to continue..."
    )

    val commands = mutableListOf(
        "sudo apt update",
        "sudo apt install flatpak -y",
        "sudo flatpak remote-add --if-not-exists flathub https://flathub.org/repo/flathub.flatpakrepo"
    )

    if (File("/usr/bin/gnome-software").exists()){
        commands.add("sudo apt install gnome-software-plugin-flatpak -y")
    }

    runShellCommands(commands, messagesBeforeStart = messageBeforeStart, pressEnterBeforeStart = true)
}