package exceptionHandling;

public class Demo11 {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException nullPointerException) {
            System.out.println("Nullpointer from null value");
        } catch (Exception exception) {
            System.out.println("value is null");
        }

        System.out.println("rest of the code");
    }
}
