package controlStatements.looping;

public class ArmstrongNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 10000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
        System.out.println(isPalindrome(153) ? "Palindrome" : "Not a palindrome");
    }

    private static boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;
        for (; number > 0; ) {
            int digit = number % 10;
            sum = sum + digit * digit * digit;
            number = number / 10;
        }
        return original == sum;
    }

    private static boolean isPalindrome(int number) {
        int original = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum = sum * 10 + digit;
            number = number / 10;
        }
        return original == sum;
    }

}
