package exceptionHandling;

public class Demo4 {
    public static void main(String[] args) {
       try{
           System.out.println(10/0);
       }catch (ArithmeticException arithmeticException){
           System.out.println("Boss dont enter 0");
           System.out.println(10/0);
       } finally {
           System.out.println("finally always rocks");
       }
        System.out.println("Rest of the code");
        System.out.println("Rest of the code");
        System.out.println("Rest of the code");
        System.out.println("Rest of the code");
        System.out.println("Rest of the code");
    }
}
