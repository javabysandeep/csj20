package exceptionHandling;

public class Demo5 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            System.out.println("rest of the try");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("catch");
            System.out.println(10 / 1);
            System.out.println("Rest of the catch");
        } finally {
            System.out.println("finally always rocks");
        }
        System.out.println("Rest of the code");

    }
}
