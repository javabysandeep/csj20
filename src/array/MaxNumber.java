package array;

public class MaxNumber {
    public static void main(String[] args) {
        int[] array = {1983, 89, 156, 32, 2133, 90, 178};
        int max = array[0];
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (max < array[index]) {
                max = array[index];
            }
            if (min > array[index]) {
                min = array[index];
            }
        }
        System.out.println("Max= " + max + " \t Min= " + min);
    }
}
