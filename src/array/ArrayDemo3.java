package array;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] array = {10, 20, 40, 56, 98, 78};
        /*System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);*/

        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
        int[][] marks = new int[10][2];
        int array2d[][] = {
                {1,78},
                {2, 85},
                {3, 89},
                {4, 56},
                {5,67},
                {6,87},
                {7, 76},
                {8, 10},
                {9,111}
        };
    }
}
