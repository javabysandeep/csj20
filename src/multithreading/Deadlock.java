package multithreading;

public class Deadlock {
    static Thread thread1;
    static Thread thread2;
    public static void main(String[] args) throws InterruptedException {
         thread1 = new Thread(()->{
            System.out.println("Thread 1");
            try {
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }); thread2 = new Thread(()->{
            System.out.println("Thread 2");
            try {
                thread1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread1.start();
        thread2.start();

    }
}
