package data

open class Employee(var name: String) {
    fun sayBello(fullname:String){
        println("Bello ${name}'s say ${fullname}")
    }
}

class Employee1(name: String) : Employee(name){

}
class ViceMentor(name: String) : Employee(name){}