package exceptionHandling;

public class Demo7 {
    public static void main(String[] args) {

        try{
            m1();
        }catch (ArithmeticException arithmeticException){
            System.out.println("denominator iz zero");
        }
        System.out.println("Rest of the main method");

    }

    private static void m1() {
        System.out.println(10/0);
    }
}
