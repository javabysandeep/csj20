package collectionFramework.wrapperClasses;

public class Demo1 {
    public static void main(String[] args) {
        Integer integer = new Integer("10");
        int a = 300;
        Integer integer1 = a;// this is auto-boxing. convert prim to obj
        int b = integer1;// this is auto-unboxing. convert obj to primitive

    }
}
