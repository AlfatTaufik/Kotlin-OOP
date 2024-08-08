package app

import data.Action

fun fireAction(action: Action) {
    action.action()
}
fun main() {
    fireAction(object : Action {
        override fun action() = println("Box Box")
    })
}