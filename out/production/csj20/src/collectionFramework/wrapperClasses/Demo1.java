package collectionFramework.wrapperClasses;

import java.math.BigInteger;

public class Demo1 {
    public static void main(String[] args) {
        Integer integer = new Integer('a');
        System.out.println(integer);
        int a = 300;
        Integer integer1 = a;// this is auto-boxing. convert prim to obj
        int b = integer1;// this is auto-unboxing. convert obj to primitive

        int number = 30;
        System.out.println("Binary "+Integer.toBinaryString(number));
        System.out.println("Octal "+Integer.toOctalString(number));
        System.out.println("Hexadecimal "+Integer.toHexString(number));
        System.out.println("reverse "+Integer.reverse(number));
        System.out.println("Bit count "+Integer.bitCount(number));

        float v = integer.floatValue();
        byte b1 = integer.byteValue();

        int i = Integer.parseInt("1234");
        Integer integer2 = Integer.valueOf("1234");
        boolean aTrue = Boolean.parseBoolean("true");
        Boolean aTrue1 = Boolean.valueOf("true");

        long longValue = Long.parseLong("1234898989899");


    }
}
