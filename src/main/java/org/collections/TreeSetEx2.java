package main.java.org.collections;

import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();

        String from = "b";
        String to = "d";

        treeSet.add("abc");
        treeSet.add("car");
        treeSet.add("dance");
        treeSet.add("elephant");
        treeSet.add("flower");
        treeSet.add("alien");
        treeSet.add("bat");
        treeSet.add("Car");
        treeSet.add("disc");
        treeSet.add("ddZZZZ");
        treeSet.add("ddzzzz");
        treeSet.add("elevator");
        treeSet.add("fan");

        System.out.println(treeSet);
        System.out.println(treeSet.subSet(from, to)); // b와 d 사이
        System.out.println(treeSet.subSet(from, to + "zzz"));

    }
}
