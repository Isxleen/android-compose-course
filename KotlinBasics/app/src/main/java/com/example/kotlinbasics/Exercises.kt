package com.example.kotlinbasics

class Exercises {
    fun createSummary(name: String, price: Double, onSale: Boolean): String {
        val state: String
        if (onSale) {
            state = "disponible"
        } else {
            state = "agotado"
        }
        val summary: String = "\"Producto: $name, Precio: \$$price, Estado: $state\""
        return summary
    }

    fun addListSecured(lista: List<String>): Int {
        var sum = 0
        lista.forEach {
            try {
                if (lista[it.toInt()] != null) {
                    sum += it.toInt()
                }else {
                    throw Exception("It has to be a number!!!")
                }
                }catch (e:Exception){
                    println(e.message)
                }
            }
        return sum
        }
    }
