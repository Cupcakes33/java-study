package org.array;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] intArr = {1,5,3,4,45,35,73,84,54};
        System.out.println(getMaxByIntArr(intArr));
        System.out.println(getMinByIntArr(intArr));

    }

    public static int getMinByIntArr(int[] intArr){
        int tmp = intArr[0];
        for(int i : intArr){
            if(tmp < i) tmp = i;
        }
        return tmp;
    }

    public static int getMaxByIntArr(int[] intArr){
        int tmp = intArr[0];
        for(int i: intArr){
            if (i == 0) tmp = i;
            if(tmp > i) tmp = i;
        }
        return tmp;
    }


}
