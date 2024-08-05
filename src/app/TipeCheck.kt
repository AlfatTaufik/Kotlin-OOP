package app

import data.Laptop

class TipeCheck() {
    fun printObject(any: Any){
       when(any) {
           is Laptop -> println("Laptop with name ${any.name}")
           is String -> println("Its string")
           is Int -> println("Its int")
       }
    }
}