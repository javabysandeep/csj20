package oops.abstraction;

public abstract class MessageService {
    abstract void sendMessage(String message);

    int messageId;

    static String serviceName = "WhatsApp";

    static String getServiceName() {
        return serviceName;
    }

    MessageService() {
        System.out.println("abstract class constructor");
    }

    {
        System.out.println("instance block");
    }

    static {
        System.out.println("static block");
    }
}
