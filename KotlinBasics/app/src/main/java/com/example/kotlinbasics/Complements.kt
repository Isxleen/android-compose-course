package com.example.kotlinbasics

val global = 8
//const val dateBirth = "10/02/2001" // in case i know the value before the begining
                                    // Its more correct to declare them in another file
lateinit var text: String

val lazytime: Long by lazy{ time() } // More simple start, capture the exact time when we are using it
fun time() = System.currentTimeMillis()

fun main(){
    println("Initial time: ${time()}")
    theme("Local and Global variables")
    val local = 5
    println("Local: $local")
    println("Global: $global")


    theme("Constant variables")
    println(Constants.dateBirth)
    val x = readln().toInt()
    println(2 * x)

    theme("Lateinit variables")
    println("Insert a text: ")
    text = readln()

    println("local() ${local()}")

    theme("Lazy variables")
    println("Lazy: $lazytime")
}

fun local(){
    val local = 4
    //println(local)
    //println(global)

    text = "- $text -"
    println(text)
}

fun theme(text: String){
    println("\n ${Constants.SEPARATOR} $text ${Constants.SEPARATOR}")
}