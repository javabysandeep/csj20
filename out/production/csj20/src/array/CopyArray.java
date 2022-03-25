package array;

public class CopyArray {
    public static void main(String[] args) {
        int[] array = {1983, 89, 156, 32, 2133, 90, 178};
        int[] copyArray = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            copyArray[index] = array[index];
        }
        for (int element : copyArray) {
            System.out.print(element+" ");
        }
    }
}
