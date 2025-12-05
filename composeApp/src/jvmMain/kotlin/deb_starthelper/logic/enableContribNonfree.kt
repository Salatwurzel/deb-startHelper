package deb_starthelper.logic

fun enableContribNonfree(){
    copyResource("debian.sources", "/tmp/debian.sources")
    val commands = listOf(
        "sudo cp /tmp/debian.sources /etc/apt/sources.list.d/debian.sources",
        "sudo apt update"
    )
}