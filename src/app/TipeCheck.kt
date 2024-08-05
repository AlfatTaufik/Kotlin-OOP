package app

class TipeCheck() {
    fun printObject(any: Any){
        if (any is String){
            println("Any is String")
        }
        if (any is Int){
            println("Any is Int")
        }
    }
}