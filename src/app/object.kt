package app

import data.Person

fun main() {
    var alfat = Person()
    alfat.firstName = "ALfat"
    alfat.lastName = "Taufik"
    alfat.fullname = alfat.firstName + " " + alfat.lastName
    println(alfat.fullname)

    var newman = Person(fullname = "Goshiki Tsutomu")
    newman.imRun("Nothing")
    newman.getFullname()

    alfat.sayHi("Sazki")
    alfat.sayHi("Chelsea", 90)
}