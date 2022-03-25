package array;

public class MultiDArray {
    public static void main(String[] args) {
        int arrayOfIntegers[] = {1, 2, 3, 4};
        int[][] matrix = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {4, 5, 6, 88},
                {7, 8, 9},
                {10, 11}
        };
        System.out.println(matrix.length);
        System.out.println(matrix);//ref
        System.out.println(matrix[0]);//ref

        for (int row = 0; row < matrix.length; row++) {
            //for loop traversing the columns
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
    }
}
