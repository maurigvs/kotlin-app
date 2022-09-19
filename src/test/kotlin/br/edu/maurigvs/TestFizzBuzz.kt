package br.edu.maurigvs

import br.edu.maurigvs.fizzBuzz
import org.amshove.kluent.shouldBeEqualTo
import org.junit.jupiter.api.Test

private fun fizzBuzz(n: Int): List<String> {

    val result: MutableList<String> = emptyList<String>().toMutableList()
    for(i in 1.rangeTo(n)){
        if((i % 3 == 0) && (i % 5 == 0)){
            result.add("FizzBuzz")
        } else if(i % 3 == 0){
            result.add("Fizz")
        } else if(i % 5 == 0){
            result.add("Buzz")
        } else {
            result.add(i.toString())
        }
    }
    return result
}

class TestFizzBuzz {

    @Test
    fun `Calling fizzbuzz with "5" returns list with 5 items`() {
        fizzBuzz(5) shouldBeEqualTo listOf("1", "2", "Fizz", "4", "Buzz")
    }

    @Test
    fun `Calling fizzbuzz with 16 returns out the correct values`() {

        val list = listOf(
            "1", "2", "Fizz", "4", "Buzz", "Fizz",
            "7", "8", "Fizz", "Buzz", "11", "Fizz",
            "13", "14", "FizzBuzz", "16"
        )

        fizzBuzz(16) shouldBeEqualTo list
    }
}