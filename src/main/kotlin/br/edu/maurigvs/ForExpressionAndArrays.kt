package br.edu.maurigvs

fun main() {

    // Exemplo declarando o índice externamente
    var index = 0;
    for(item in 10.rangeTo(20).step(2)){
        print("${++index} ) $item, ")
    }
    println();

    // Mesmo resultado declarando a variável na declaração
    for((indx, item) in 10.rangeTo(20).step(2).withIndex()){
        print("${indx + 1} ) $item, ")
    }
    println()

    // Exemplo iterando sobre arrays
    val myArray = arrayOf(10, 20, 30, 40, 50)
    for (item in myArray.indices){ // indices é uma propriedade, não um método
        println("at index $item is ${myArray[item]}")
    }
    println()

}