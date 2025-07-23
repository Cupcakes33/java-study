package org.array;

import java.util.*;

public class RandomIntArr2 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getRandomIntArrGenerator(45,6)));

    }

    public static int[] getRandomIntArrGenerator(int limit, int length){
        int[] tmpArr = new int[limit];

        for(int i=0;i<limit;i++){
            tmpArr[i] = i+1;
        }

        return shuffle(tmpArr, length);
    }

    public static int[] shuffle(int[] intArr, int length){
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int j = i + random.nextInt(intArr.length - i);

            int temp = intArr[i];
            intArr[i] = intArr[j];
            intArr[j] = temp;
        }

        return Arrays.copyOf(intArr, length);
    }
}
