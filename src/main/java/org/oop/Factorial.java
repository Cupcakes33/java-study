package org.oop;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(5));
        System.out.println(factorial.factorial2(5));
    }

    public int factorial(int number) {
        int result = 1;
        for(int i=number; i>1; i--){
            result *= i;
        }
        return result;
    }

    public int factorial2(int number) {
        int result = 1;
        if(number == 1){
            return 1;
        }else{
            result = number * factorial2(number-1);
        }
        return result;
    }
}
