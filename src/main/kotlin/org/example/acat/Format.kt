package org.example.acat

abstract class Format(val name: String) {

    abstract fun build(text: String): String

    fun write(text: String) = println(build(text))
}