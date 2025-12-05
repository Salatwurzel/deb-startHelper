package deb_starthelper.logic

fun installRustSDK() {
    val startMessages = listOf(
        "---------------------------------",
        "THIS WILL DOWNLOAD AND EXECUTE THE RUST INSTALLER",
        "---------------------------------",
        "",
        "Press Enter to continue"
    )

    val commands = listOf(
        "wget http://sh.rustup.rs -O /tmp/rustup-init.sh",
        "chmod +x /tmp/rustup-init.sh",
        "sh /tmp/rustup-init.sh"
    )

    runShellCommands(commands, pressEnterBeforeStart = true, messagesBeforeStart = startMessages)
}