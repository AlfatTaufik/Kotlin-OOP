package data

interface myInterface{
    fun compFunc()
}

class CompObject {
    companion object tester : myInterface {
        val value : String = "Its unmutable"
        val color : String = "Red"

        override fun compFunc(){
            println("Ini fungsi yang diakses melalui Companion Object")
        }
    }
}