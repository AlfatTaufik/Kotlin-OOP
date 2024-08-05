package data

open class Employee(var name: String) {
    open fun sayBello(name:String){
        println("Bello ${name}'s say ${name} ${this.name}")
    }
}

class Employee1(name: String) : Employee(name){
    override fun sayBello(fullname: String) {
        println("Hello my name is $fullname iam employee 1 ${super.name}}")
    }
}
class ViceMentor(name: String) : Employee(name){
    override fun sayBello(fullname: String) {
        println("Vice me name is $fullname iam vice president ${this.name}")
    }
}