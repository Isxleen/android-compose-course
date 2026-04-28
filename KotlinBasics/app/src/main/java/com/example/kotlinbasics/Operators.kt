package com.example.kotlinbasics

fun main(){
    var version: Int? = 3
    version = null
    println("Version: ${version ?: 5}")

    println("--- Math Operators ---")
    val x = readln()
    val y = readln()
    println("$x $y")
    println("Sum: ${x.toInt() + y.toInt()}")
    println("Sub: ${x.toInt() - y.toInt()}")

    var numX = x.toInt()
    var numY = y.toInt()
    numX += 5
    println("x + 5 = $numX")
    numY += 6
    println("y - 6 = $numY")

    numX++
    println("numX++ = $numX")
    numY--
    println("numY-- = $numY")


    println("--- Equiality Operators ---")
    val isEqual: Boolean = (3 == 3)
    val isNotEqual : Boolean = (2 != 3)
    println("isEqual: $isEqual")
    println("isNotEqual: $isNotEqual")

    println("--- Logic Operators ---")
    val or = (1 == 1 || 1 == 2)
    val and = (1 == 1 && 1 == 2)

}