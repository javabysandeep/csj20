package multithreading;

public class EvenOddThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            System.out.println("Is Daemon Thread "+Thread.currentThread().isDaemon());
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(i);
                }
            }
        }, "t1");

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                if (i % 2 != 0) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(i);
                }
            }
        }, "t2");

        thread1.setDaemon(true);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

    }
}
