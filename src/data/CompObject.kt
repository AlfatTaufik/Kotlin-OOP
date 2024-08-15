package data

interface myInterface{
    fun compFunc()
}

class CompObject {
    companion object tester : myInterface {
        val value : String = "Its unmutable"

        override fun compFunc(){
            println("Ini fungsi yang diakses melalui Companion Object")
        }
    }
}