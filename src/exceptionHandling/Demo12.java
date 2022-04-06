package exceptionHandling;

public class Demo12 {
    public static void main(String[] args) {
        int i = m1();
        System.out.println(i);
    }

    private static int m1() {
        try {
            System.out.println(10/0);
            return 1;
        } catch (Exception exception) {
            return 2;
        } finally {
            //return 3;
        }
    }
}
