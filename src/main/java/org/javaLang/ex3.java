package org.javaLang;

public class ex3 {
    public static void main(String[] args) {
        String str1 = new String("string");
        String str2 = new String("string");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str1.intern());

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(str1.equals(str2));
        System.out.println(str1 == str2);
    }
}
