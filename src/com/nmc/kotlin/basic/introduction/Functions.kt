package com.nmc.kotlin.basic.introduction

fun printMessage(message: String): Unit {

    println(message)
}
fun printMessageWithPrefix(message: String, prefix: String = "Prefix:") {

    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {

    return x + y
}

fun main() {
    printMessage("printMessage fun")
    printMessageWithPrefix("PrintMessageWithPrefix with default prefix")
    printMessageWithPrefix("PrintMessageWithPrefix with new prefix", "New Prefix: -> ")
    printMessageWithPrefix(prefix = "Log", message = "Calls the same function using named arguments and changing the order of the arguments.")
    println(sum(3, 5))
}