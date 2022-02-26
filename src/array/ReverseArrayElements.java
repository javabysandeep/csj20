package array;

public class ReverseArrayElements {
    public static void main(String[] args) {
        int[] array = {1983, 89, 156, 32, 2133, 90, 178};
       /* for (int index = array.length - 1; index >= 0; index--) {
            System.out.print(array[index]+" ");
        }*/
        System.out.println("before reversing");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int left = 0, right = array.length - 1; left < right; left++, right--) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
        System.out.println("After reverse");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
