package com.example.kotlinbasics

fun main(){
    println("--- Data Structures ---")
    println("Inmutable lists")
    val workingDays: List<String> = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday") // only lecture
    println("Working days: $workingDays")
    println("Size: ${workingDays.size}")
    println("First element: ${workingDays[0]}")
    println("First element: ${workingDays.first()}")
    println("Last element: ${workingDays.last()}")
    println("Contains 'Monday': ${workingDays.contains("Monday")}")

    println("Mutable lists")
    val friends: MutableList<String> = mutableListOf("Isabel", "Maria", "Guadalupe", "Alex")
    friends.add("Andrea")
    println("My friends are: $friends")
    friends.remove("Guadalupe")
    println("My friends are: $friends")
    friends.removeAt(2)
    println("My friends are: $friends")
    //friends.set(0, "Alejandra")
    friends[0] = "Alejandra"
    println("My friends are: $friends")

    println("Maps")
    val inventoryMap = mutableMapOf<String, Int>()
    inventoryMap["T1"] = 13
    inventoryMap["H2"] = 4
    inventoryMap["T2"] = 52
    println("Inventory: $inventoryMap")
    inventoryMap.remove("T2")
    println(inventoryMap)
    println(inventoryMap.keys)
    println(inventoryMap.values)

    println("Transformations")
    val numbers = listOf(10,20,5)
    println("Taxes: ${numbers.map { it * 1.2 }}")
    println("Filtered: ${numbers.filter { it > 10 }}")

    val drinks = listOf<String>("Coca", "Fanta", "Sprite")
    println("Menu: ${drinks zip numbers}")

    val num = listOf(listOf(1,2,3), listOf(4,5,6), listOf(7,8,9))
    println(num)
    println(num.flatten())

    println("Filters")
    val tools = listOf("Hammers", "Nuts", "Long Boards")
    println(tools.filter { it.contains("a") })
    println(tools.filter { it.length < 5 })
    println("Hammer index: ${tools.indexOf("Hammers")}")

    println("Ordering")
    println(workingDays)
    println("Reverse: ${workingDays.reversed()}")
    println("Sorted: ${workingDays.sorted()}") // alphabetic order
    println("Sorted it.lenght: ${workingDays.sortedBy { it.length }.reversed()}")

}