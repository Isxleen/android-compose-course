package com.example.kotlinbasics

/**
 * 1 bit: basic unit in informatic systems (0,1)
 * 1Kb: 1024 bit = 2, 4,8, 16, 32, 64, 128, 256, 512 , 1024
 * 1Mb = 1024Kb
 * 1Gb = 1024Mb
 * 1Tb = 1024Gb
 *
 */
fun main(){
    println("--- Boolean ---")
    val imSpannsih: Boolean = true
    println("Am I Spannsih? The answer is: $imSpannsih")

    println("--- Whole numbers ---")
    val countries: Int = 120
    println("Countries in the world: $countries")

    val miliseconds: Long = 66_55_469_238L
    println("Miliseconds: $miliseconds")

    println("--- Decimal Numbers --- ")
    val weight: Float = 20.50f
    println("Weight: $weight")

    val diameter: Double = 2.56_666_666_666_666
    println("Diameter: $diameter")

    println("--- Text ---")
    val letter1: Char = 'I'
    val letter2: Char = 's'
    val letter3: Char = 'a'

    print(letter1)
    print(letter2)
    println(letter3)

    val fullName: String = "Isabel"
    println("My name is $fullName")

    val specialCases: String = "Last letter is \"n\" thanks to \\ and not to $letter3"

    println("--- Concatenation ---")
    val name = readln() // data input
    println("Hello " + name)
    println("Hello $name")

    println("--- Nulls ---")
    var nickname: String? = null
    nickname = "Isxleen"
    println("Nickname's lenght: ${nickname!!.length}")
    nickname = null
    println("Nickname's lenght: ${nickname?.length}")

    println("--- Elvis Operator ---")
    var version: Int? = 3
    version = null
    println("Version: ${version ?: 5}")









}