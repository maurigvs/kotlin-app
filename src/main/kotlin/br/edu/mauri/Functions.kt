package br.edu.mauri

fun main() {

    println("10 + 20  = ${myMathFunction(10, 20)}")

    println("10 + 20  = ${myExpressionBodyFunction(10, 20)}")

    println("10 + 20  = ${myExpressionBodyFunctionWithInference(10, 20)}")

    println("10 + 20  = ${myFunctionWithDefaults(10, 20, "Hello")}")

    // Exemplo chamando a função usando os parametros default
    println("Defaul sum  = ${myFunctionWithDefaults(message = "Hello")}")
}

// Exemplo de função com argumentos e tipo de retorno
fun myMathFunction(number1: Int, number2: Int) : Int {
    return number1 + number2
}

// Exemplo de funcão em 1 linha
fun myExpressionBodyFunction(number1: Int, number2: Int) : Int = number1 + number2

// Exemplo de função com inferência de retorno
fun myExpressionBodyFunctionWithInference(number1: Int, number2: Int) = number1 + number2

fun myFunctionWithDefaults(number1: Int = 1, number2: Int = 5, message: String = "Hi"): Int {
    val result = number1 + number2
    print("$message, ")
    return result
}