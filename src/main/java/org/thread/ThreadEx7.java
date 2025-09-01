
package main.java.org.thread;

public class ThreadEx7 {
    public static void main(String[] args) {
        ThreadEx7_1 th1 = new ThreadEx7_1();
        ThreadEx7_2 th2 = new ThreadEx7_2();

        th1.start();
        th2.start();

        delay(2000);

        System.out.println("<<메인 종료>>");

    }

    static class ThreadEx7_1 extends Thread {
        @Override
        public void run() {
            for(int i=0; i<3000; i++){
                if(i%50 == 0) System.out.println();
                System.out.print("-");
            }
            System.out.println("<<1종료>>");
        }
    }

    static class ThreadEx7_2 extends Thread {
        @Override
        public void run() {
            for(int i=0; i<3000; i++){
                if(i%50 == 0) System.out.println();
                System.out.print("|");
            }
            System.out.println("<<2종료>>");
        }
    }


    static void delay(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e){

        }
    }



}

