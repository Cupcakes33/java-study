package org.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandomIntArr {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getRandomIntArrGenerator(45,6)));

    }

    public static int[] getRandomIntArrGenerator(int limit, int length){
        int[] tmpArr = new int[limit];
        int[] resultArr = new int[length];

        for(int i=0;i<limit;i++){
            tmpArr[i] = i+1;
        }

        int[] shuffledArr = shuffle(tmpArr);
        for(int i=0; i<length; i++){
            resultArr[i] = shuffledArr[i];
        }

        return resultArr;
    }

    public static int[] shuffle(int[] intArr){
        List<Integer> list = new ArrayList<>(Arrays.stream(intArr).boxed().toList());
        Collections.shuffle(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
