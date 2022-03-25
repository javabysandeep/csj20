package controlStatements;

public class MulitpleOfNumber {
    public static void main(String[] args) {
        int number = 14;
        int multiple = 5;
        System.out.println(number % multiple == 0 ? "multiple" : "not multiple");

        if (number % multiple == 0 ){
            System.out.println("Multiple");
        } else{
            System.out.println("Not a multiple");
        }

    }
}
