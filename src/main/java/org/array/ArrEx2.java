package org.array;

public class ArrEx2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] tmp = new int[arr.length * 2];

        for(int i=0;i<arr.length;i++){
            tmp[i] = arr[i];
        }

        arr = tmp;

        printArr(arr);
        printArr(tmp);


    }

    public static void printArr(int[] arr){
        for(int i : arr){
            System.out.println(i);
        }
    }
}
