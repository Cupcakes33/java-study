package org.ifAndFor;

public class FlowEx1 {
    public static void main(String[] args) {
        for(int i=0, j=1;i<10 || j<20;i++){
            // i<10 이거나 j<20 일 때. 증감식이 i만 더하고 있더라도 반복문을 빠져나가지 않는다
            // for(int i=0, j=1;i<10 && j<20;i++){
            // i<10 이고 j<20 일 때. i 가 10이 되는 순간 조건식이 false로 평가되어 반복문을 빠져나온다
            if(j>i){
                j++;
            }
            System.out.print("i = " + i);
            System.out.println(", j = " + j);
        }

    }

}
