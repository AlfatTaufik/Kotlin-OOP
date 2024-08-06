package app

import data.Boss

fun main() {
    var test1 = Boss("Jonathan")
    var employee1 = test1.Employee("Liandi")
    employee1.sayhi()

    var test2 = Boss("Jona")
    var employee2 = test2.Employee("Lian")
    employee2.sayhi()
}