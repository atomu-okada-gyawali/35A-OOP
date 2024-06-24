package Tasks.Week6;

import java.util.Arrays;

// 1. Write a java program to Add two 2x3 matrices
public class task5 {
public static void main(String[] args) {
    int[][] matrix1 = {{1,2,3},{4,5,6}};
    int[][] matrix2 = {{9,10,11},{12,13,14}};
    int[][] matrixSum = new int[2][3];
    for(int i = 0; i<2; i++){
        for(int j = 0; j <3; j++){
            matrixSum[i][j] = matrix1[i][j] + matrix2[i][j];
        }
    }
    System.out.println(Arrays.deepToString(matrixSum));
}
}
