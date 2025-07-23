package org.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class shuffle {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5,6,7};
        int[] shuffledArr1 = shuffleByIntArr(intArr);
        int[] shuffledArr2 = fisherYatesShuffleByIntArr(intArr);

        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(shuffledArr1));
        System.out.println(Arrays.toString(shuffledArr2));

    }

    public static int[] shuffleByIntArr(int[] intArr){
        List<Integer> list = new java.util.ArrayList<>(Arrays.stream(intArr).boxed().toList());
        Collections.shuffle(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    //Fisher-Yates-Shuffle
    //배열의 마지막 인덱스(n-1)부터 시작해서 첫 번째 인덱스(0) 방향으로 역순으로 진행.
    //현재 인덱스 i에 대해, 0부터 i (자신 포함) 사이의 인덱스 j를 무작위로 선택.
    //i번째 요소와 무작위로 선택된 j번째 요소를 스왑.
    //이 과정을 배열의 맨 앞에 도달할 때까지 반복.
    public static int[] fisherYatesShuffleByIntArr(int[] intArr){
        int[] tmpArr = Arrays.copyOf(intArr, intArr.length);
        Random random = new Random();

        for(int i = tmpArr.length-1; i > 0; i--){
            int j = random.nextInt(i+1);

            int temp = tmpArr[i];
            tmpArr[i] = tmpArr[j];
            tmpArr[j] = temp;
        }
        return tmpArr;

    }


}
