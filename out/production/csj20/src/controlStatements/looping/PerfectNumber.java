package controlStatements.looping;

public class PerfectNumber {
    public static void main(String[] args) {
        int number = 28;
        for (int i = 1; i <=10000 ; i++) {
            if (isPerfect(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfect(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        return sum == number;
    }
}
