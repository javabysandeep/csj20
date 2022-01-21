package operators;

public class TernaryOperator {
    public static void main(String[] args) {
        int budget = 50000;
        String decision = (doYouHaveBudget(budget)) ? "visit goa" : "stay home stay safe";
        System.out.println(decision);

        System.out.println((4 <= 4) ? 'A' : 50);

    }

    static boolean doYouHaveBudget(int budget) {
        return budget >= 60000;
    }
}
