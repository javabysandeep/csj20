package multithreading;

public class Syncrhonization {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread thread1 = new Thread(() -> {
            printer.print("thread1");
        });
        Thread thread2 = new Thread(() -> {
            printer.print("thread2");
        });
        thread1.start();
        thread2.start();
    }
}

class Printer {
    synchronized void print(String message) {
        for (int i = 1; i <=10; i++) {
            try {
                wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+ " printing......." + message);
        }
    }
}