package controlStatements.looping;

public class SumOfNEven {
    public static void main(String[] args) {
        int number = 100;
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i%2==0){
                sum = sum + i;
            }
        }
        System.out.println("Sum of Even "+number+" is "+sum);
    }
}
