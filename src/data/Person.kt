package data

class Person( var firstName:String = "",
              var lastName:String? = null,
              var fullname:String? = null) {

    fun sayHi(name:String){
        println("Hello sir ${name}, iam ${this.firstName}")
    }

    fun sayHi(name:String, age:Int){
        println("Hello sir ${name}, $age iam ${this.firstName}")
    }

    fun imRun(word: String){
        println("Hello im Run $word")
    }

    fun getFullname(){
        println("$fullname")
    }
}