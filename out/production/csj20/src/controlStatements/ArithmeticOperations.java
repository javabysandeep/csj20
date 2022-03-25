package controlStatements;

public class ArithmeticOperations {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 200;
        char operation = '%';
        switch (operation) {
            case '+':
                System.out.println("Addition " + (number1 + number2));
                break;
            case '-':
                System.out.println("Substraction " + (number1 - number2));
                break;
            case '*':
                System.out.println("Multiplication " + (number1 * number2));
                break;
            case '/':
                System.out.println("Division " + (number1 / number2));
                break;
            case '%':
                System.out.println("Remainder " + (number1 % number2));
                break;
            default:
                System.out.println("Invalid input ");
                break;
        }
    }
}
