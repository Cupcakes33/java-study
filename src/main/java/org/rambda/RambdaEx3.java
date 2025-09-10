package main.java.org.rambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RambdaEx3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.forEach(i-> System.out.print(i+" ,"));
        System.out.println();

        list.removeIf(x -> x % 2 == 0 || x % 3 == 0);
        System.out.println(list);

        list.replaceAll(i -> i * 10);
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        for(int i=0;i<5;i++){
            map.put(String.valueOf(i), String.valueOf(i));
        }

        map.forEach((k,v)-> {
            StringBuilder s = new StringBuilder("{")
                    .append(k).append(", ").append(v).append("}");
            System.out.println(s);
        });




    }
}
