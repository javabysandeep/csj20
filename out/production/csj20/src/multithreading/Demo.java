package multithreading;
public class Demo {
    public static synchronized void main(String[] args) {
        Data data = new Data();
        Thread producer = new Thread(() -> {
            data.sendData();
        }, "producer");
        Thread consumer = new Thread(() -> {
            data.receiveData();
        }, "consumer");
        producer.start();
        consumer.start();
    }
}

class Data {
    synchronized void sendData()  {
        for (int i = 0; i < 5; i++) {
            System.out.println("sending data ----------" + Thread.currentThread().getName());
        }
        try {
            wait(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("After wait sendData");
    }

    synchronized void receiveData() {
        for (int i = 0; i < 5; i++) {
            System.out.println("receiving data---- " + Thread.currentThread().getName());
        }
        //notify();
    }
}

