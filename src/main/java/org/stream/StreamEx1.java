package main.java.org.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamEx1 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<10; i++){
            arr.add((int) (Math.random()*1000));
        }

        Optional<Integer> result = arr.stream().filter(i -> i > 300).findAny();
        System.out.println(result);
    }
}
