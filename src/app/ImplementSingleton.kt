package app

import data.CompObject
import data.Utilities

fun main() {
    println(Utilities.name)
    println(Utilities.toUpper("Nothing"))

    CompObject.compFunc()
    println(CompObject.value)
    println(CompObject.color)
}