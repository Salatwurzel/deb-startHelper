package deb_starthelper.logic

import java.io.File

fun copyResource(resourceFile: String, outputFile: String) {
    Thread().contextClassLoader.getResourceAsStream(resourceFile)?.copyTo(File(outputFile).outputStream())
}