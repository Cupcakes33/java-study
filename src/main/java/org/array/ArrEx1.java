package org.array;

public class ArrEx1 {
    public static void main(String[] args) {

        int[] arr1 = new int[5];
        arr1 = new int[]{1, 2, 3, 4, 5};

        int arr2[] = new int[]{6,7,8,9,0};
        // Field 'arr2' has C-style array type declaration.

        for (int i : arr1){
            System.out.println(i);
        }


        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }
    }

}
