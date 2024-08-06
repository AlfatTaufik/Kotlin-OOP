package data

interface Interaction {
    var name: String
    fun sayHello(){
        println("Hello, ${name}!")
    }
}

interface Go : Interaction {
    fun go(){
        println("Go!")
    }
}

class Implement(override var name: String) : Interaction, Go {

}

//Interface bisa digunakan untuk menyimpan properti agar lebih aman
//Function gawajib di override
//Multiple interface diijinkan
//Inheritance antar interface