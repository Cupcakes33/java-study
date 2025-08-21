package main.java.org.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetEx1 {
    public static void main(String[] args) {
        String[] objArr = {"1", "1", "2","2","3","3","4","4","5","5"};

        Set<String> set = new HashSet<>(Arrays.asList(objArr));
        System.out.println(set);
    }
}
