package data

class Address {
    var street:String = ""
    var city:String = ""
    var state:Int = 0

    constructor(street: String, state: Int) {
        println("its first")
    }

    constructor(street:String) : this(street, 14) {
        println("its second")
    }
}