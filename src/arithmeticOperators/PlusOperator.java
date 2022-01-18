package arithmeticOperators;

public class PlusOperator {
    public static void main(String[] args) {

        System.out.println(10 + 20 + 30 + "A" + 30 + 50);//60A3050
        System.out.println("A" + 30 + 10 + 'A');//A3010A
        System.out.println(10 * 4 + 20 + 'A' + "A");
        System.out.println(3 / (2 * 4) + 20 + 'A' + "A");//BODMAS//85A
        System.out.println(10 % 5);//R=0
        System.out.println(10 / 5);//Q=2
        System.out.println(10 % 1);//R=0
        System.out.println(10 / 1); //Q=10
        System.out.println(1 / 10);//Q=0
        System.out.println(1 % 10);//R=1
//        System.out.println(10 / 0);//AE / by zero
        System.out.println(0 / 10);//0
        System.out.println(0 % 10);//0
//        System.out.println(10 % 0);//AE  / by zero
        System.out.println(10 / 0.0); //Infinity
        System.out.println(10 % 0.0);//NaN
    }
}
