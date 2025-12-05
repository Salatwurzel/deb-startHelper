package deb_starthelper.logic

fun installBackportsKernel() {
    copyResource("debian-backports.sources", "/tmp/debian-backports.sources")
    val commands = listOf(
        "sudo cp /tmp/debian-backports.sources /etc/apt/sources.list.d/debian-backports.sources",
        "sudo apt update",
        "sudo apt install linux-image-amd64 -t trixie-backports"
    )
}