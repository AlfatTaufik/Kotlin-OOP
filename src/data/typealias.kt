package data

typealias listString = List<String>

fun eachElement(value: listString){
    value.forEach{
        println(it)
    }
}

fun main() {
    val list : listString = listOf("Januari", "Februari", "Maret", "April")
    eachElement(list)
}