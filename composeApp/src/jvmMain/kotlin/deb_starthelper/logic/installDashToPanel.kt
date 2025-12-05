package deb_starthelper.logic

fun installDashToPanel() {
    val messageBeforeStart = listOf<String>(
        "---------------------------------",
        "This will download an extension called 'Dash to Panel' to display a Taskbar.",
        "(like in Windows)",
        "---------------------------------",
        "",
        "Press Enter to continue..."
    )

    val commands = listOf(

        "gdbus call --session --dest org.gnome.Shell.Extensions --object-path /org/gnome/Shell/Extensions --method org.gnome.Shell.Extensions.InstallRemoteExtension \"dash-to-panel@jderose9.github.com\"",
        "gdbus call --session --dest org.gnome.Shell.Extensions --object-path /org/gnome/Shell/Extensions --method org.gnome.Shell.Extensions.InstallRemoteExtension \"appindicatorsupport@rgcjonas.gmail.com\""
    )
    runShellCommands(commands, messagesBeforeStart = messageBeforeStart, pressEnterBeforeStart = true)
}