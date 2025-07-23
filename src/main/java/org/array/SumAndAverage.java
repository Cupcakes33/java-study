package org.array;

public class SumAndAverage {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5,6,7,8,9};

        System.out.println(sum(intArr));
        System.out.println(average(intArr));
    }

    public static int sum(int[] intArr){
        int sum = 0;
        for(int i : intArr){
            sum += i;
        }
        return sum;
    }

    public static double average(int[] intArr){
        int sum = sum(intArr);
        return (double) sum /intArr.length;
    }
}
