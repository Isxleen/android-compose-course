package com.example.kotlinbasics

fun main(){
    println("--- Throw ---")
    val ex = "Juan"
    val name = readln()



    println("--- Try, Catch and Finnaly ---")

    try {
        if(name == ex){
            throw Exception("The unnameble :(")
        }else{
            println("Hello $name :)")
        }
    } catch (e: Exception) {
        println(e.message)
    } finally {
        println("Bye")

    }

}