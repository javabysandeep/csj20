package dataTypes;

public class DatatypeDemo {
    public static void main(String[] args) {
        //byte, short, int, long, float, double, char, boolean
        byte b1 = 127;
        short s = 32767;

        int i = 32770;
        long lVal = Long.MAX_VALUE-1;
        System.out.println(lVal);
        char ch = 'A';
        char ch2 = 65;
        System.out.println(ch2);
        float floatVal = 100.12f;
        double doubleVal = Double.MAX_VALUE;
        System.out.println(doubleVal);
        boolean boolVal = true;
    }
}
