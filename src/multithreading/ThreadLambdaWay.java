package multithreading;

public class ThreadLambdaWay {
    public static void main(String[] args) {
        Thread worker = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }, "worker");
        worker.start();
    }
}
