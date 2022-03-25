package oops.classComponents;

public class Account {
    int accountNumber;
    float accountBalance;
    static String bankName = "SBI";

    public float getAccountBalance(int accountNumber) {
        return accountNumber == 123 ? this.accountBalance : -000000.1f;
    }

    public  Account(){
        System.out.println("zero param constructor");
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.accountNumber = 123;
        account.accountBalance = 15000;
//        System.out.println(accountNumber); //CTE
        System.out.println(bankName);
        System.out.println(account.accountBalance);//15000
        System.out.println(account.accountNumber);//123
        System.out.println(Account.bankName);//SBI
        System.out.println(account.getAccountBalance(123));
    }
}
