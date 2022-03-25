package multithreading;

public class ThreadMethodsYieldDemo {

    public static void main(String[] args) throws InterruptedException {
       Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }, "t1");

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }, "t2");

        thread1.setPriority(10);
        thread2.setPriority(10);

        thread1.start();
        thread2.start();

        Thread.yield();

        System.out.println(Thread.currentThread().getPriority());
        for (int i = 0; i < 10; i++) {
            //Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName());
        }
    }
}
