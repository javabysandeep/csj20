package exceptionHandling;

public class Demo8 {
    public static void main(String[] args) {

        try {
            m1();
        } catch (Exception e) {
            System.out.println("catch");
        }

        System.out.println("Rest of the main method");

    }

    private static void m1() throws Exception, NegativeArraySizeException {
        throw new Exception();
    }
}
