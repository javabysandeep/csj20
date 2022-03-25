package multithreading;

public class ThreadMethodsJoinDemo {
    static Thread thread1;
    static Thread thread2;

    public static void main(String[] args) throws InterruptedException {
        thread1 = new Thread(() -> {
            try {
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }, "t1");

        thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }, "t2");


        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        for (int i = 0; i < 10; i++) {
            //Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName());
        }
    }
}
