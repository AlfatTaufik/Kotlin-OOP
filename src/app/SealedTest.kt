package app

import data.Minus
import data.Multiply
import data.Operation
import data.Plus

    fun testImplementation(value1: Int, value2: Int, operation: Operation) : Int {
        return when (operation) {
            is Plus -> value1 + value2
            is Minus -> value1 - value2
            is Multiply -> value1 * value2
        }
    }

fun main() {

    println(testImplementation(1,2, Plus()))
    println(testImplementation(1,2, Minus()))
}
