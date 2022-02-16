package oops.inheritance;

public class Loan {
    int loanId;
    float loanAmount;
    static String name = "HDFC";

    void printLoanDetails() {
        System.out.println(loanId + " " + loanAmount);
    }

    static void bankDetails() {
        System.out.println("HDFC bank");
    }

    public Loan(int loanId, float loanAmount) {
        System.out.println("Loan class constructor");
        this.loanId = loanId;
        this.loanAmount = loanAmount;
    }

    public Loan() {
        System.out.println("Loan class constructor");
    }

    {
        System.out.println("Loan Instance block");
    }

    static {
        System.out.println("Loan Static block");
    }
}
