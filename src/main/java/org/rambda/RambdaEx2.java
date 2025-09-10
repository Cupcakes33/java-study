package main.java.org.rambda;

public class RambdaEx2 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method(100);
    }

}

class Outer {
    int val = 10;

    class Inner {
        int val = 20;

        void method(int i) {
            int val = 30;

            MyFunction2 f = () -> {
                System.out.println(i);
                System.out.println(val);
                System.out.println(++this.val);
                System.out.println(++Outer.this.val);
            };

            f.myMethod();
        }
    }

}

@FunctionalInterface
interface MyFunction2 {
    void myMethod();
}