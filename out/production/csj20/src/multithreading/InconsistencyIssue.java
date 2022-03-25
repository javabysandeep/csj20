package multithreading;

public class InconsistencyIssue {
    static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 10000; i++) {
                print();
            }
        }, "thread1");
        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 10000; i++) {
                print();
            }
        }, "thread2");
        Thread thread3 = new Thread(() -> {
            for (int i = 1; i <= 10000; i++) {
                print();
            }
        }, "thread3");
        thread1.start();
        thread2.start();
        thread3.start();
        thread1.join();
        thread2.join();
        thread3.join();
        System.out.println("Counter " + counter);
    }

    private synchronized static void print() {
        counter++;
    }
}
