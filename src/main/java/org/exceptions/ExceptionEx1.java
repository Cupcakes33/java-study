package org.exceptions;

public class ExceptionEx1 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;

        for(int i = 0; i < 10; i++){
            int ex = (int)(Math.random() * 10);;
            try {
                result = number / ex;
            } catch (ArithmeticException e) {
                result = number;
            }
            System.out.println(result);
        }
    }
}
