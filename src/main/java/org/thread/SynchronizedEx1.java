package main.java.org.thread;

/**
 * synchronized 키워드 사용 예제
 * - Account.withdraw 메서드에 synchronized를 적용하여 임계 구역을 보호합니다.
 * - 두 개의 스레드가 동시에 같은 Account 인스턴스의 잔고를 변경할 때
 *   데이터 레이스 없이 일관성을 유지하는 방법을 보여줍니다.
 */

public class SynchronizedEx1 {
    public static void main(String[] args) {
        // 같은 Runnable(=같은 Account 인스턴스 공유)을 두 스레드에 전달합니다.
        Runnable r = new RunnableEx1();
        new Thread(r).start(); // 스레드 1 시작
        new Thread(r).start(); // 스레드 2 시작
    }

    static class Account {
        // 공유 자원: 계좌 잔액(예: 1000원)
        private int balance = 1000;

        // 현재 잔액 조회도 동기화하여 최신값 보장
        public synchronized int getBalance() {
            return balance;
        }

        /**
         * 출금 메서드. 메서드 전체 동기화 대신, 필요한 구역만 synchronized 블록으로 보호합니다.
         * - 같은 모니터(this)를 사용하므로 메서드 동기화와 동일한 상호배제 효과를 가집니다.
         */
        public void withdraw(int money) {
            synchronized (this) {
                if (balance >= money) {
                    try { Thread.sleep(1000); } catch (InterruptedException e) { /* 무시 */ }
                    balance -= money; // 임계 구역 내에서 안전하게 차감
                }
            }
        }
    }

    static class RunnableEx1 implements Runnable {
        // 두 스레드가 공유하는 동일한 Account 인스턴스
        Account acc = new Account();

        public void run() {
            while (acc.getBalance() > 0) {
                // 예시: 100~300 단위 출금을 의도(현재 식은 100만 생성될 수 있음)
                int money = (int) (Math.random()) * 3 + 1 * 100;
                acc.withdraw(money); // 동기화된 출금 호출
                System.out.println("balance:" + acc.getBalance());
            }
        }
    }
}
