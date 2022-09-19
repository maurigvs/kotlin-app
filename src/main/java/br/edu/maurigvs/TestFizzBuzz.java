package br.edu.maurigvs;

public class TestFizzBuzz {

    public static void main(String[] args) {
        fizzBuzz(5);
        fizzBuzz(16);
        fizzBuzz(100);
    }

    static void fizzBuzz(int number){

        System.out.print("[");
        for (int i = 1; i <= number; i++) {

            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.print("FizzBuzz");
            } else if(i % 3 == 0){
                System.out.print("Fizz");
            } else if(i % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(i);
            }
            if(i < number){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
