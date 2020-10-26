package org.example.acat

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