package controlStatements.looping;

public class Power {
    public static void main(String[] args) {
        int number = 2;
        int power = 5;
        int output = 1;
        for (int i = 1; i <= power; i++) {
            output = output * number;
        }
        System.out.println(output);
    }
}
