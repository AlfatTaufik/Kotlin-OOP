package data

fun main() {
    fun howLongIsIt(text: String?){
        val length = text?.length ?: "Nothing on there"
        println("the length is $length")
    }

    fun greet(name: String?){
        println("Hello ${name ?: "Dameda" }")
    }

    greet(null)

    val name: String? = null
    val name3: String = "Hloo"
    howLongIsIt(name)
    howLongIsIt(name3)

    val obj: Any? = "Mada mada mada mada mada mada mada"
    val navigableMap: String = obj as? String ?: "Nothing on there"
    println(navigableMap)
}