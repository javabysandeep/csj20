package operators.logicalOperators;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        System.out.println(4 & 5); //4
        System.out.println(4 | 5); //5
        System.out.println(4 ^ 5); //1
        System.out.println((4 > 3) && (5 > 4));//true
        System.out.println((4 > 3) & (5 > 4));//true
        System.out.println(true && true);//true
        System.out.println(true & true);//true
//        System.out.println(4 || 5);//CTE
//        System.out.println(!5);//CTE
        System.out.println(!true);//false
        System.out.println(true ^ false);//true
    }
}
