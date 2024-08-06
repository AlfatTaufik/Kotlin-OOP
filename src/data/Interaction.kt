package data

interface Interaction {
    var name: String
    fun sayHello()
}

class Implement(override var name: String) : Interaction {
    override fun sayHello() {
        println("Hello, $name")
    }
}