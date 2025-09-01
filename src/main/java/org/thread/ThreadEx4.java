
package main.java.org.thread;

public class ThreadEx4 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for(int i=0; i<300; i++){
            if (i%30 == 0) System.out.println();
            System.out.printf("%s", "-");
        }

        System.out.println("소요 시간 : " + (System.currentTimeMillis() - startTime));

        for(int i=0; i<300; i++){
            if (i%30 == 0) System.out.println();
            System.out.printf("%s", "|");
        }

        System.out.println("소요 시간2 : " + (System.currentTimeMillis() - startTime));
    }


}
