package data

class Cars(brand: String, machine: String, year:Int = 2020 ) {
    init {
        println("Congratulations your new cars is  ${brand}")
    }
    var nameBrand: String = brand
    var machineCar: String = machine
    var year:Int = year
}