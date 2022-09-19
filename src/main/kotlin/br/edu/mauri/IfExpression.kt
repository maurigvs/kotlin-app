package br.edu.mauri

// Método main torna a classe executável
fun main() {

    val myInt = 199
    val aInt: Int = 7

    // Java
    // int lowest = (myInt < aInt) ? myInt : aInt

    // Kotlin
    // Uso do IF requer um ELSE
    val lowest = if(myInt < aInt) myInt else aInt

    val temp = 25
    val isAirConditionerOn = if(temp >= 26){
        println("It is warm!")
        true
    } else {
        println("It's not so warm!")
        false
    }

    // append pode ser substituido por $ + nome da variável
    println("Is the air conditioner on: $isAirConditionerOn")
}