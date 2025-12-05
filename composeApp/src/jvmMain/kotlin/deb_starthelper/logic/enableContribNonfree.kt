package deb_starthelper.logic

fun enableContribNonfree(){
    copyResource("debian.sources", "/tmp/debian.sources")

    val messageBeforeStart = listOf<String>(
        "---------------------------------",
        "Only run this if you havent made any modifications to the debian.sources file in the past.",
        "Custom modifications will be overwritten.",
        "---------------------------------",
        "",
        "Press Enter to continue..."
    )

    val commands = listOf(
        "sudo cp /tmp/debian.sources /etc/apt/sources.list.d/debian.sources",
        "sudo apt update"
    )

    runShellCommands(commands = commands, messagesBeforeStart = messageBeforeStart, pressEnterBeforeStart = true)
}