package data

abstract class AbstractClass(var name: String = "Juned") {
}

class Turunan(name: String) : AbstractClass(name) {}

//Kelas abstract gabisa dibuat object, hanya bisa diturunkan