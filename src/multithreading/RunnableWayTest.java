package multithreading;

public class RunnableWayTest {
    public static void main(String[] args) {
        //MyRunnable IS-A type of Runnable
        MyRunnableTask myRunnableTask = new MyRunnableTask();
//        myRunnableTask.start();
        Thread thread = new Thread(myRunnableTask, "MyTask");
        thread.start();

    }
}
