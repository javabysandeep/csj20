package controlStatements;

public class DebitCardIssue {
    public static void main(String[] args) {

        int salary = 200001;
        // basic upto 25k
        if (salary <= 25000) {
            System.out.println("Basic card");
        }
        // silver
        if (salary > 25000 && salary <= 50000) {
            System.out.println("silver card");
        }
        // gold
        if (salary > 50000 && salary <= 100000) {
            System.out.println("gold card");
        }
        // diamond
        if (salary > 100000 && salary <= 200000) {
            System.out.println("diamond card");
        }

        // platinum
        if (salary > 200000) {
            System.out.println("platinum card");
        }
        if (true && true) {

        }
    }
}
