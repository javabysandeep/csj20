package dataTypes;

public class TypeCastingIssue {
    public static void main(String[] args) {
        byte b1 = 1;
        byte b2 = 1;
        byte b3 = (byte) (b1 + b2);

        int a = 130;
        byte byteValue = (byte) a;
        System.out.println(byteValue);


        char ch = 'A';
        char ch2 = 65;
        System.out.println(ch2);//A

        System.out.println('A' + 5);
        System.out.println('A' + 5.0);
        System.out.println('A' + 'A');

        char ch4 = 'A' + 5;
        System.out.println(ch4);


    }
}
