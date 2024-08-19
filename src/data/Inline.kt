package data

inline class Inline(val value: Int)
inline class lastname(val value: String)

fun addNumber(a: Int, sum: Inline){
    println("The amount of value is $a and the sum is ${a + sum.value}")
}

fun fullName(first: String, last: lastname){
    println("${first + last.value}")
}

fun main() {
    var number = Inline(3)
    addNumber(9, number)
    fullName("Jonathan", lastname("Liandi"))
}