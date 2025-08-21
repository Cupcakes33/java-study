package main.java.org.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx2 {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        HashSet<Integer> kyo = new HashSet<>(a);
        HashSet<Integer> hab = new HashSet<>(a);
        HashSet<Integer> cha = new HashSet<>(a);

        for(int i=1; i<=8; i++){
            if(i<4 && i<=6){
                a.add(i);
            } else if(i<=5){
                a.add(i);
                b.add(i);
            } else {
                b.add(i);
            }
        }

        kyo.retainAll(b);
        System.out.println("A ∩ B (교집합) = " + kyo);

        hab.addAll(b);
        System.out.println("A ∪ B (합집합) = " + hab);

        cha.removeAll(b);
        System.out.println("A - B (차집합) = " + cha);

    }
}
