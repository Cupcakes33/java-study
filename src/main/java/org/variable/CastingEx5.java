package org.variable;

public class CastingEx5 {
    public static void main(String[] args) {
        double d = 123456789012345.123456789012345;
        int i = (int)d;

        System.out.printf("d  = %15.15f\n", d);
        System.out.printf("i  = %d\n", i);

    }
}
