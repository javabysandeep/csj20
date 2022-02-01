package controlStatements.looping;

public class PrimeRange {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("No. of primes " + count);
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
