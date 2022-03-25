package oops.abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
//        MessageService messageServicei = new MessageService();
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage("hello");

        A a = new C();
        a.m1();
//        a.m2();//CTE
        B b = new C();
        b.m1();
        b.m2();

        C c = new C();
        c.m1();
        c.m2();

    }
}
