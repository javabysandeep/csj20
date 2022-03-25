package operators.comparisionOperators;

public class ComparsionDemo {
    public static void main(String[] args) {
        int a = 30;//assignment operator
        int b = 4 * 5;
        //LHS must be a variable
        //RHS can be value, another variable, expression, method call
        System.out.println(4 > 5);//false
        System.out.println(4 < 5);//true
        System.out.println(a = 5);//5
        System.out.println(4 == 5);//equality operator// false
        System.out.println(4 != 5);//true
        System.out.println(4 >= 5);//false
        System.out.println(4 <= 5);//true
        System.out.println(4 == 'A');//false
        System.out.println(65 == 'A');//true
        System.out.println(true == true);//true
        System.out.println(true != true);//false
//        System.out.println(true >= true);//CTE
//        System.out.println(true <= true);//CTE
    }
}
