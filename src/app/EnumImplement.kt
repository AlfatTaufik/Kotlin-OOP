package app

import data.EnumClass

fun main() {
    println("Please insert the value in your enum class.")
    var value = readLine()?.toIntOrNull()

    if (value != null) {
        val enumInput = EnumClass.values()
        val matchingValue = enumInput.find { it.input == value }

        if (matchingValue != null){
            println(matchingValue.checkInput())
        }
        else{
            println(EnumClass.DAY.checkInput(value))
        }
    }
}