package data

data class objectFinder(val name: String, val age: Int)



fun main() {
    val user = objectFinder("John", 42)
    val (name, age) = user
    val dataEnumerate = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    for((key, value) in dataEnumerate) {
        println("$key -> $value")
    }

    fun printValue(print: objectFinder){
        val (x, u) = print
        println(u)
    }
    var john = objectFinder("Johnfq", 42342)
    printValue(john)

    println("User $name is $age years old")
}