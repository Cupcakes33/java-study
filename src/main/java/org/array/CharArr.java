package org.array;

import java.util.Arrays;

public class CharArr {
    public static void main(String[] args) {
        String str = "String";
        char[] charArr = {'C','h','a','r'};

        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(new String(charArr));
    }
}
