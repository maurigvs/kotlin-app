package br.edu.maurigvs

fun main() {

    // Exemplos de inferência de tipo pelo compilador

    // String
    val myPhase = "I'm a String"

    // double
    val myPI = 3.14

    // int
    val myAnswer = 42

    // Exemplo com tipagem explícita
    val aString: String = ""
    val aDouble: Double = 0.0
    val aInt: Int = 0

    // Outros tipos
    val myDouble = 1.999
    val myFloat = 1.9f // tipo primitivo / sem o f é assumido como double
    val myFloatC = 1.9F // tipo objeto
    var myLong = 875439924348L // L maiusculo obrigatório
    val myInt = 199
    val myShort: Short = 12
    val myByte: Byte = 127

    val aLong = 123_456_789
    val aSameLong = 123456789

    val anInt: Int = 7
    val anLong: Long = anInt.toLong() // cast neste caso nao é automático
}