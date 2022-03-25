package array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // we want to hold multiple values
        //1. create that many variables. managing that variables is difficult. It is time-consuming.
        //2. Array
        // how many values- 10000
        // same type
        // memory requirement --> 10000 * 4 == 40,000
        // 100 --> base address + 4*0
        // 104 --> base address  + 4*1
        // 108 --> base address  + 4*2

        int multipleValues[] = {1,2,3,4,5}; // declaration + initialization

        int array[];// array declaration

        array = new int[1000];//array initialization

        int array2[] = new int['A'];
        long arrayOfLong[] = new long[100];
        String arrayOfStrings[] = {"abc","xyz","def"};
        String arrayOfStrings1[] = new String[10];

        // Array size cannot be float,long, double, boolean
        //Array size can be specified with byte, short, int, char
        //if we specify size of an array in negative: NegativeArraySizeException
        System.out.println(array2);

        System.out.println(array2.length);

        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);
        System.out.println(array2[3]);
        System.out.println(array2[4]);
        System.out.println(array2[5]);
        System.out.println(array2[6]);
        System.out.println(array2[7]);
        System.out.println(array2[8]);
        System.out.println(array2[9]);

        System.out.println(array2[999]);// AIOBEx: trying to access element out of array range. [index starts from 0  till length-1]


    }
}
