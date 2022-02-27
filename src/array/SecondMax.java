package array;

public class SecondMax {
    public static void main(String[] args) {
        int[] array = {1983, 89, 156, 32, 2133, 90, 178};
        int max = array[0];
        int secondMax = array[0];
        for (int index = 0; index < array.length; index++) {
            if (max < array[index]) {
                secondMax = max;
                max = array[index];
            }
        }
        System.out.println("Max= " + max + " \t Second Max = " + secondMax);
    }
}
