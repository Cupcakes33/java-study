package main.java.org.collections;

import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        String[] data = {"A","K","A","K","D","K","A","K","K","K","Z"};

        HashMap<String, Integer> map = new HashMap<>();

        for(String str : data){
            // map.put(str, map.getOrDefault(str, 0) + 1);
            if(map.containsKey(str)){
                int value = map.get(str);
                map.put(str, value+1);
            }else{
                map.put(str, 1);
            }
        }

        System.out.println(map.toString());

    }
}
