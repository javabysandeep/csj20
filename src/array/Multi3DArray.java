package array;

public class Multi3DArray {
    public static void main(String[] args) {
        int[][][] matrix = new int[2][3][3];
        int[][][] arr = {
                {
                        {1, 2, 3}, {0, 0, 0}, {0, 0, 0}
                },
                {
                        {0, 0, 0}, {0, 0, 0}, {9, 10, 10}
                }
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("{ ");
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k]+",");
                }
                System.out.print(" }");
            }
        }

    }
}
