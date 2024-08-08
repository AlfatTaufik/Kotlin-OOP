package data

enum class EnumClass(var input: Int) {
    DAY(7),
    MONTH(12),
    YEAR(30);

    fun checkInput(userInput : Int = input) : String{
        return when(userInput){
            7 -> "Its Day"
            12 -> "Its Month"
            30 -> "Its Year"
            else -> "Its Whatever"
        }
    }
}

