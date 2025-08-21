package main.java.org.collections;

import java.util.TreeSet;

public class TresSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        for(int i=0; treeSet.size()<6; i++){
            int num = (int) (Math.random() * 45) +1;
            treeSet.add(num);
        }

        System.out.println(treeSet);
    }
}
