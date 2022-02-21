package multithreading;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        };
        Thread thread = new Thread(task,"Thread1");
        thread.start();
//        thread.run();

        Thread thread2 = new Thread(
                () -> {
                    for (int i = 0; i < 10; i++) {
                        System.out.println(Thread.currentThread().getName());
                    }
                }
                , "Thread2");
        thread2.start();

        thread2.join();
        thread.join();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
