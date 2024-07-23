package app

import data.Cars

fun main() {
    var toyota = Cars("Mazda", "Rotary")
    println(toyota.year)

    var porsche = Cars("GT-2", "Porsche", 2023)
    println(porsche.nameBrand)
}