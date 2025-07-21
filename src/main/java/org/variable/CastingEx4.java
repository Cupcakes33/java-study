package org.variable;

public class CastingEx4 {
    public static void main(String[] args) {
        int i = 1234567890;
        float f = (float)i;
        double d = (double)i;

        System.out.printf("i  = %d\n", i);
        System.out.printf("f  = %10.5f\n", f);
        System.out.printf("d  = %10.5f\n", d);
    }
}
