package controlStatements.looping;

public class DivisionWithoutOperator {
    public static void main(String[] args) {
        int numerator = 32;
        int denominator = 3;
        //Q = 10, R=2
        int countQuotient = 0;
        while (numerator >= denominator) {
            numerator = numerator - denominator;
            countQuotient++;
        }
        System.out.println("Quotient " + countQuotient + " Remainder " + numerator);
    }
}
