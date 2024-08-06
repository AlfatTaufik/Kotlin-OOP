package data

sealed class Operation(name : String) {
}

class Plus : Operation("Plus")
class Minus : Operation("Minus")
class Multiply : Operation("Multiply")