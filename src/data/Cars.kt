package data

class Cars(var brand: String,var machine: String,var year:Int = 2020 ) {
    init {
        println("Congratulations your new cars is  ${brand}")
    }

    constructor(brandName: String, machineName: String) : this(brandName, machineName, 2003){
        println("Its secondary when people doesnt insert their car year")
    }

    constructor(brandName: String) : this(brandName, " "){
        println("Its secondary when people doesnt insert their machine")
    }
}