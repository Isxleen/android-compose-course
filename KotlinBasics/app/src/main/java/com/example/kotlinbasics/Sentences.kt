package com.example.kotlinbasics

fun main(){
    println("Insert X value: ")
    val x = readln().toInt()
    println("Insert Y value: ")
    val y = readln().toInt()

    if(x > y)
        println("X is greater than Y")
    else if(x < y)
        println("X is less than Y")
    else
        println("X is equal to Y")

    println("Insert your name to consult your salary")
    val name = readln()

    when(name){
        "Isabel" -> println("Salary: 10000")
        "Maria" -> println("Salary: 15000")
        "Joy",
        "Guadalupe" -> println("Salay: 2000")
        "Alex" -> {
            println("Salary: 25000")
            println("Bonus: 5000")
        }
        else -> {
            println("Salary: 30000")
        }

    }

}