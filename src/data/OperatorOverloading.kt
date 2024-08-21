package data

import jdk.incubator.vector.VectorOperators

class Operator(var x: Int, val y: String) {
    operator fun plus(o: Operator) {
        println(x + o.x)
    }
}