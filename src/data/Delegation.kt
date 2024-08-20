package data

import kotlin.properties.Delegates

class Example {
    val lazyValue: String by lazy {
        println("Test, Its only appear at first")
        "Its appear everytime"
    }

    var observable by Delegates.observable("Its the first") {
        first, second, third -> println("$second ==== $third")
    }
}

fun main() {
    val example = Example()
    println(example.lazyValue)
    println(example.lazyValue)
    println(example.lazyValue)
    println(example.lazyValue)

    println(example.observable)
    println(example.observable)
    example.observable = "Its second"
    example.observable = "Last One"
    example.observable = "Last Two"
}