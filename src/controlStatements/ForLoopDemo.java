package controlStatements;

public class ForLoopDemo {
    public static void main(String[] args) {
        int i = 0, j = 5;
        for (System.out.println("init"); i < j; i++, System.out.println("incr/decre")) {
            System.out.println("for loop");

        }

        for (int a = 0, b = 1; a < b; a++, b++) {
            System.out.println("infinite loop");
        }
    }
}
