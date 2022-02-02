package controlStatements.looping;

public class WhileDemo {
    public static void main(String[] args) {
        int number = 123;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += digit; // sum = sum + digit
            number /= 10; // number = number/10
        }
//        System.out.println(sum);

        // break demo
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            if (i == 5) {
                continue;
            }
            i--;
        }
//        break;
    }
}
