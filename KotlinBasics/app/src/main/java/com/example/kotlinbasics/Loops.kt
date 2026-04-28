package com.example.kotlinbasics

fun main(){
    println("--- For ---")
    for(i in 1..10){
        println("$i, ")
    }

    val name = "Isabel"
    for (i in 0 .. name.length -1){
        println("Index: ${name[i]}")
    }

    for(letter in name){
        println(letter)
    }
    name.forEach { println(it) }

    println("--- While and Do While ---")
    var index = 0
    while (index < name.length){
        println("$index: ${name[index]}")
        index++
    }

    do {
        index--
        println("$index: ${name[index]}")
    } while (index>0)

    println("--- Return, Break and Continua ---")
    // Finnish the loop
    for (i in 0..4){
        if( i == 2) break
        println("Position $i")
    }
    // Skippes tho the next iteration
    for (i in 0..4){
        if( i == 2) continue
        println("Position $i")
    }
    // Ends current context
    for (i in 0..4){
        if( i == 2) return
        println("Position $i")
    }

}