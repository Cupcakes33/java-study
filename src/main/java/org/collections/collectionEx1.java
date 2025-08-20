package main.java.org.collections;

import java.util.ArrayList;
import java.util.Collections;

public class collectionEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);

        list1.add(5);
        //list1.add(new Integer(2)); 'Integer(int)' is deprecated and marked for removal
        list1.add(1);
        list1.add(4);
        list1.add(2);
        list1.add(3);

        ArrayList list2 = new ArrayList(list1.subList(1,4)); // 1번째 원소부터 4이전까지
        print(list1, list2);

        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));  // list1의 모든것이 list2에 포함되어 있는가 ?

        list2.add("B");
        list2.add("C");
        list2.add(3, "A"); // 3번째 자리에 A를 넣기
        print(list1, list2);

        list2.set(3, "AA"); // 3번째 자리를 AA로 교체하기
        print(list1, list2);

        System.out.println(list1.retainAll(list2));

        print(list1, list2);

        for(int i=list2.size()-1;i>=0;i--){
            if(list1.contains(list2.get(i))){ // 만약 list1에 list2의 i 번째 원소가 포함되어있다면
                list2.remove(i); // list에서 i 번째 원소를 제거한다.
            }
        }

        // list2.removeAll(list1); 이렇게도 지울 수 있음
        print(list1, list2);




    }

    static void print(ArrayList list1, ArrayList list2){
        System.out.println(list1);
        System.out.println(list2);

    }

}
