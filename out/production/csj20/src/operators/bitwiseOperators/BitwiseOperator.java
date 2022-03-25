package operators.bitwiseOperators;

public class BitwiseOperator {
    public static void main(String[] args) {
//        System.out.println(4&&5);//CTE
        System.out.println(4 & 5);//4
        System.out.println(4 | 5);//5
        System.out.println(4 ^ 5);//1
        System.out.println(4 << 1);//8
        System.out.println(84 << 10);//84 *2^10
        System.out.println(84 >> 10);//84 /2^10--> 0
        System.out.println(4 >> 1);//2
        System.out.println(4 << 3);//32
        System.out.println(4 >> 3);//0
        //left shift : number * 2^bits
        //right shift: number/2^bits

        System.out.println(~4);//-5  --> changeSign(number+1) -->
        System.out.println(~-4);//3  --->
    }
}
