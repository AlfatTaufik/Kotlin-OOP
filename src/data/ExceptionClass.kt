package data

fun divide(a: Int, b: Int): Int {
    return try {
        a / b
    }
    catch (e: Exception){
        println("Something happen")
        2
    }
}

fun main() {
    println(divide(20, 4))
    println(divide(2, 0))
}
