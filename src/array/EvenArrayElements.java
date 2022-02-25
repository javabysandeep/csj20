package array;

public class EvenArrayElements {
    public static void main(String[] args) {
        int numbers[] = {97, 12, 156,
                36000, 49800, 45000, 76000,
                191000, 10000
        };
        for (int index = 0; index < numbers.length; index++) {
            if(numbers[index]%2!=0){
                System.out.println(numbers[index]);
            }
        }
    }
}
