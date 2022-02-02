package controlStatements.looping;

public class DoWhileDemo {
    public static void main(String[] args) {
        do {
            System.out.println("Cash withdrawl");
            System.out.println("Mini statement");
            System.out.println("Pin change");
            System.out.println("Pay bills");
            System.out.println("Language");
        } while (authenticatePin(1234));
    }

    private static boolean authenticatePin(int pin) {
        return pin == 1235;
    }
}
