package controlStatements;

public class BasicPrograms {
    public static void main(String[] args) {
        System.out.println(isEven(100));
        System.out.println(isPositive(100));
        System.out.println(maxOfThree(100,200,390));
        System.out.println(isAlphabate('a'));
        System.out.println('a'+1);

        char c = '4';
        System.out.println((c>='A' && c<='Z')||(c>='a' && c<='z'));
    }

    private static boolean isAlphabate(char c) {
        return (c>='A' && c<='Z')||(c>='a' && c<='z');
    }

    private static boolean isEven(int number) {
        /*if(number%2==0){
            return true;
        } else{
            return false;
        }*/
        return number % 2 == 0;
    }

    private static boolean isPositive(int number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }
//        return number >0;
    }

    private static int maxOfThree(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
        /*return (num1 > num2 && num1 > num3)
                ? num1
                : (num2 > num1 && num2 > num3) ? num2 : num3;*/


    }

}
