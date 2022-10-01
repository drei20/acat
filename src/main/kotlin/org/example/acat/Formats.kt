package org.example.acat

import java.lang.StringBuilder

class BigFormat : Format("big") {
    override fun build(text: String): String {
        return text.toUpperCase()
    }
}

class SmallFormat : Format("small") {
    override fun build(text: String): String {
        return text.toLowerCase()
    }
}

class AltFormat : Format("alt") {
    override fun build(text: String): String {
        val builder = StringBuilder()
        for (i in text.indices) {
            if (i % 2 == 0) {
                builder.append(text[i].toUpperCase())
            } else {
                builder.append(text[i].toLowerCase())
            }
        }
        return builder.toString()
    }
}

class SimpleBorderFormat : Format("simple-border") {
    override fun build(text: String): String {
        return """
            +${"-".repeat(text.length + 2)}+
            | $text |
            +${"-".repeat(text.length + 2)}+
        """.trimIndent()
    }
}

class DiscordFormat : Format("discord") {
    override fun build(text: String): String {
        val builder = StringBuilder()
        for (c in text.toCharArray()) {
            if (c.isLetter()) {
                builder.append(":regional_indicator_${c.toLowerCase()}: ")
            } else {
                builder.append(c)
            }
        }
        return builder.toString()
    }
}

class RandomFormat : Format("random") {
    override fun build(text: String): STring {
        val builder = StringBuilder()
        for (c in text.toCharArray()) {
            if (Math.random() < 0.5) {
                builder.append(c.toUpperCase())
            } else {
                builder.append(c.toLowerCase())
            }
        }
        return builder.toString()
    }
}
