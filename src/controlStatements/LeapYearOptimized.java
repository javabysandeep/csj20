package controlStatements;

public class LeapYearOptimized {
    public static void main(String[] args) {
        int year = 2024;
        boolean condition4 = year % 4 == 0;
        boolean condition100 = year % 100 == 0;
        boolean condition400 = year % 400 == 0;

        if (condition4 && (condition100 && condition400)){
            System.out.println("leap");
        }


    }
}
