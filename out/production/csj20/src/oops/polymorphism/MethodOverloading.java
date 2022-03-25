package oops.polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(addition(20, 30));
        System.out.println(addition(20, 30, 50));
        System.out.println(addition("cyber", "success"));
        main(10.5f);
    }

    public static void main(float args) {
        System.out.println("main method overloaded");
    }

    private static int addition(int num1, int num2) {
        return num1 + num2;
    }

    private static void addition(int num1, float num2) {
        //return num1 + num2;
    }

    private static int addition(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    private static String addition(String s1, String s2) {
        return s1 + s2;
    }


}
