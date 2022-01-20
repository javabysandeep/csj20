package operators.unary;

public class PrePostDecrement {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = --a;
        int d = b--;

        System.out.println(a);//3
        System.out.println(b);//4
        System.out.println(c);//3
        System.out.println(d);//5

        //a=3, b=4, c=3, d=5

        System.out.println(--a + a-- + --b + c-- + a-- + --d);//15

        System.out.println(a);//0
        System.out.println(b);//3
        System.out.println(c);//2
        System.out.println(d);//4


        int i = 4;
        int j = 5;
        int k = 6;

        System.out.println(i++ + j++ + k++ + --i + --j - k++ + --i);

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}
