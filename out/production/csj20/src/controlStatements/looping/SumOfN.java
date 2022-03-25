package controlStatements.looping;

public class SumOfN {
    public static void main(String[] args) {
        int number = 100;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of "+number+" is "+sum);
    }
}
