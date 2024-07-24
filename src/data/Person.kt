package data

class Person {
    var firstName:String = ""
    var lastName:String? = null
    var fullname:String? = null

    fun sayHi(name:String){
        println("Hello sir ${name}, iam ${this.firstName}")
    }
}