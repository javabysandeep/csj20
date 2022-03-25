package multithreading;

public class ThreadLambdaWay {
    public static void main(String[] args) {
        Thread worker = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        });
        worker.setName("worker");
        worker.setPriority(Thread.NORM_PRIORITY);
        worker.start();
        worker.start();
        System.out.println(Thread.currentThread().getName());
    }
}
