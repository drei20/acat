package org.example.acat

import kotlin.system.exitProcess

fun usageAndExit() {
    println("Usage:")
    println("  # java -jar acat.jar <format> <text>")
    exitProcess(0)
}

fun main(args: Array<String>) {
    if (args.isEmpty() || args.size == 1) {
        usageAndExit()
    }

    val formats = mutableListOf<Format>()
    formats.add(BigFormat())
    formats.add(SmallFormat())

    formats.firstOrNull { it.name == args[0] }
        ?.write(args.drop(1).joinToString(separator = " "))
        ?: usageAndExit()
}