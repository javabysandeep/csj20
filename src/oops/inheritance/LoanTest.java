package oops.inheritance;

public class LoanTest {
    public static void main(String[] args) {
        //case 1
        Loan loan = new Loan(101, 10000);
        /*System.out.println(loan.loanId);
        System.out.println(loan.loanAmount);
        System.out.println(Loan.name);
        loan.printLoanDetails();
        Loan.bankDetails();*/

        //output
        // SB--> IB --> Con --> 101--> 10000--->HDFC--->

        //Case 2:
       /* PersonalLoan personalLoan = new PersonalLoan();
        System.out.println(personalLoan.loanId);
        System.out.println(personalLoan.loanAmount);
        System.out.println(Loan.name);
        personalLoan.printLoanDetails();
        PersonalLoan.bankDetails();*/

        //case 3
        Loan loanRef = new PersonalLoan();
        System.out.println(loanRef.loanId);
        System.out.println(loanRef.loanAmount);
        loanRef.printLoanDetails();

        System.out.println(Loan.name);
        PersonalLoan.bankDetails();
//        System.out.println(loanRef.instanceVar);
    }
}
