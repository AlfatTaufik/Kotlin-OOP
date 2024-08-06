package data

class Boss(var name: String) {
    inner class Employee(var name: String) {
        fun sayhi(){
            println("My boss is ${this@Boss.name} and my name is $name")
        }
    }
}