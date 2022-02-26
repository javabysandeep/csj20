package array;

import java.util.Scanner;

public class MatrixOperation {
    public static void main(String[] args) {
        //int[][] matrix = acceptMatrix();
        //matrix addition
        int[][] matrix1 = acceptMatrix();
        int[][] matrix2 = acceptMatrix();
        int[][] addition = addMatrices(matrix1,matrix2);
        System.out.println("Matrix addition");
        printMatrix(addition);
    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int result[][] = new int[matrix1.length][matrix1[0].length];
        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1[row].length; column++) {
                result[row][column] = matrix1[row][column] + matrix2[row][column];
            }
        }
        return result;
    }

    public static int[][] acceptMatrix() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns");
        int numberOfRows = scanner.nextInt();
        int numberOfColumns = scanner.nextInt();
        int[][] matrix = new int[numberOfRows][numberOfColumns];
        System.out.println("Enter the matrix elements");
        for (int row = 0; row < matrix.length ; row++) {
            for (int column = 0; column < matrix[row].length ; column++) {
                matrix[row][column] = scanner.nextInt();
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length ; column++) {
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
    }
}
