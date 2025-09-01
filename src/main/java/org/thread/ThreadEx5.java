
package main.java.org.thread;

public class ThreadEx5 {
    static long startTime = 0;
    public static void main(String[] args) {
        ThreadEx5_1 r = new ThreadEx5_1();
        Thread t1 = new Thread(r);
        t1.start();

        startTime = System.currentTimeMillis();

        for(int i=0; i<300; i++){
            if (i%30 == 0) System.out.println();
            System.out.printf("%s", "-");
        }

        System.out.println("소요 시간 : " + (System.currentTimeMillis() - ThreadEx5.startTime));


    }

    static class ThreadEx5_1 implements Runnable {
        public void run(){
            for(int i=0; i<300; i++){
                if (i%30 == 0) System.out.println();
                System.out.printf("%s", "|");
            }

            System.out.println("소요 시간2 : " + (System.currentTimeMillis() - ThreadEx5.startTime));
        }
    }


}
