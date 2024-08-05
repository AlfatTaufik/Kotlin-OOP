package data

abstract class AbstractClass(var name: String = "Juned") {
    abstract var what: String
    abstract fun run(name: String)
}

class Turunan(name: String) : AbstractClass(name) {
    override var what: String = "Turunan"

    override fun run(name: String) {
        println("what is running $what")
    }
}

//Kelas abstract gabisa dibuat object, hanya bisa diturunkan