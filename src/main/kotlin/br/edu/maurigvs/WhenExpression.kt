package br.edu.maurigvs

fun main() {

    val pizzasOrdered = 1

    // Exemplo de Switch
    when(pizzasOrdered){
        0 -> println("Not hungry")
        1,2 -> println("Hungry")
        3 -> println("Very hungry")
        else -> print("Are you sure?")
    }

    when(pizzasOrdered){
        Math.abs(pizzasOrdered) -> println("Ordered 0 or more pizzas")
        else -> print("Ordered less then 0")
    }

    when(pizzasOrdered){
        0 -> println("Not hungry")
        // Range de valores
        in 1 .. 4 -> println("Got some orders")
        in 5 .. 9 -> println("Business is up")
        else -> print("")
    }

    when{
        pizzasOrdered <= 0 -> print("None ordered")
        // Mod do valor / numero impar
        pizzasOrdered % 2 == 1 -> print("Odd number ordered")
        // Numero par
        pizzasOrdered % 2 == 0 -> print("Even number ordered")
    }

}