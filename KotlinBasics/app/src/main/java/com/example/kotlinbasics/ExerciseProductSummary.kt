package com.example.kotlinbasics

class ExerciseProductSummary {
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
}