package deb_starthelper.logic

//TODO
//Taskbar Icons

fun installDashToPanel() {
    val commands = listOf("gdbus call --session --dest org.gnome.Shell.Extensions --object-path /org/gnome/Shell/Extensions --method org.gnome.Shell.Extensions.InstallRemoteExtension \"dash-to-panel@jderose9.github.com\"")
    runShellCommands(commands = commands, autoClose = true)
}