package deb_starthelper.logic
fun installStandardFirefox() {
    val messageBeforeStart = listOf<String>(
        "---------------------------------",
        "Going to install the latest Firefox version from Flathub.",
        "---------------------------------",
        "",
        "Press Enter to continue..."
    )

    val commands = mutableListOf<String>(
        "sudo apt install flatpak -y",
        "flatpak remote-add --if-not-exists flathub https://flathub.org/repo/flathub.flatpakrepo",
        "flatpak install org.mozilla.firefox"
    )

    runShellCommands(commands = commands, pressEnterBeforeStart = true, messagesBeforeStart = messageBeforeStart)
}