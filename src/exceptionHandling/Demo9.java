package exceptionHandling;

public class Demo9 {
    public static void main(String[] args) {

        try {
            m1();
        } catch (NegativeArraySizeException e) {
            System.out.println("catch");
        }

        System.out.println("Rest of the main method");

    }

    private static void m1() {
        throw new NegativeArraySizeException();
    }
}
