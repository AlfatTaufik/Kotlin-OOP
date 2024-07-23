package app

import data.Address
import data.Cars

fun main() {
    var toyota = Cars("Mazda", "Rotary")
    println(toyota.year)

    var porsche = Cars("GT-2", "Porsche", 2023)
    println(porsche.brand)

    var lambo = Cars("Lambo")

    var house = Address("Sesame")

    var home = Address("Sesasaa", 15)
}