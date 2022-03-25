package array;

public class PalindromeArray {
    public static void main(String[] args) {
        int[] array = {1983, 89, 121, 32, 12321, 90, 178};
        for (int index = 0; index < array.length ; index++) {
            if (isPalindrome(array[index])){
                System.out.println(array[index]);
            }
        }
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        return originalNumber == reverse;
    }
}

interface A {
    default void display() {
        System.out.println();
    }
}
