package app

import data.Product

fun main() {
    var product = Product("Indomie", 10000.00, "food")
    println(product)
    var product2 = product.copy(price = 12000.00)
    println(product2)
}