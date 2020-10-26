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