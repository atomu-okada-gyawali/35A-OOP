package Tasks.Week6;

import java.util.Arrays;

// 2. Write a java program to print transpose 2X2 matrices
public class task6 {
public static void main(String[] args) {
    int[][] matrix = {{1,2},{4,5}};
    int[][] matrixTransposed = new int[2][2];
    for(int i = 0; i <matrix.length; i++){
        for(int j = 0; j < matrix[i].length; j++){
            matrixTransposed[i][j] = matrix[j][i];
        }
    }
    System.out.println(Arrays.deepToString(matrixTransposed));
}
}
