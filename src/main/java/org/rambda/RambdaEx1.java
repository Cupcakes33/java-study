package main.java.org.rambda;
public class RambdaEx1 {
    static void execute(MyFunction f){
        f.run();
    }

    static MyFunction getMyFunction() {
        MyFunction m3 = () -> System.out.println("m3.run()");
        return m3;
    }

    public static void main(String[] args) {
        MyFunction m1 = () -> System.out.println("m1.run()");

        MyFunction m2 = new MyFunction() {
            @Override
            public void run() {
                System.out.println("m2.run()");
            }
        };

        MyFunction m3 = getMyFunction();

        m1.run();
        m2.run();
        m3.run();

        execute(m1);
        execute(() -> System.out.println("run()"));


    }


}

@FunctionalInterface
interface MyFunction {
    void run();
}