package org.example.acat

import kotlin.system.exitProcess

fun usageAndExit() {
    println("Usage:")
    println("  # java -jar acat.jar <format> <text>")
    println("  # java -jar acat.jar -f")
    exitProcess(0)
}

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        usageAndExit()
    }

    val formats = mutableListOf<Format>()
    formats.add(BigFormat())
    formats.add(SmallFormat())
    formats.add(AltFormat())

    if (args.size == 1) {
        if (args[0] == "-f") {
            println("Formats:")
            for (format in formats) {
                println("  - ${format.name}")
            }
            exitProcess(0)
        }
        usageAndExit()
    }

    formats.firstOrNull { it.name == args[0] }
        ?.write(args.drop(1).joinToString(separator = " "))
        ?: usageAndExit()
}
