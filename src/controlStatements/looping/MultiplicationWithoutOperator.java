package controlStatements.looping;

public class MultiplicationWithoutOperator {
    public static void main(String[] args) {
        int number1 = 45;
        int number2 = 10;
        int result = 0;
        for (int i = 1; i <=number1 ; i++) {
            result = result + number2;
        }
        System.out.println(result);

    }
}
