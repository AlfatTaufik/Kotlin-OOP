package data

open class Employee(var name: String) {
    open fun sayBello(fullname:String){
        println("Bello ${name}'s say ${fullname}")
    }
}

class Employee1(name: String) : Employee(name){
    override fun sayBello(fullname: String) {
        println("Hello my name is $fullname iam employee 1")
    }
}
class ViceMentor(name: String) : Employee(name){
    override fun sayBello(fullname: String) {
        println("Vice me name is $fullname iam vice president")
    }
}