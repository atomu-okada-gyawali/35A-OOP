package Tasks.Week6;

import java.util.Arrays;

// 3. Write a java program to print mirror 2X2 matrices
public class task7 {
    public static void main(String[] args) {
        
        int[][] matrix = {{1,2},{3,4}};
        int[][] matrixMirror = new int[2][2];
        for(int i = 0; i <matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrixMirror[i][j] = matrix[i][1-j];// matrixMirror[i][j] = j ==0? matrix[i][j+1]:matrix[i][j-1];
            }
        }
        System.out.println(Arrays.deepToString(matrixMirror));
    }

}
