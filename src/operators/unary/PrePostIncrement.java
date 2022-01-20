package operators.unary;

public class PrePostIncrement {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = ++a;
        int d = b++;

        System.out.println(a);//2
        System.out.println(b);//3
        System.out.println(c);//2
        System.out.println(d);//2

        //a=2, b=3, c=2, d=2

        System.out.println(++a + a++ + ++b + c++ + a++ + ++d);
    }
}
