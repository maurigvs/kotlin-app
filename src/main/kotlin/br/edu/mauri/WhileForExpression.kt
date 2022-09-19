package br.edu.mauri

fun main() {

    var x = 0;

    // Exemplo de WHILE
    while (x < 10){
        println("X = $x")
        x += 3
    }

    do {
        println("x = $x")
        x -= 3
    } while (x > 0)

    // Exemplo de FOR
    for (item in 1 .. 10){
        // item++ // não é permitido pq item é val
        print("$item, ")
    }

    println();

    for (ch in "maurigvs"){
        print("$ch, ")
    }
}