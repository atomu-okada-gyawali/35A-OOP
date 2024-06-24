package Tasks.Week6;

import java.util.Arrays;

// 4. Write a java program to Multiply two 3x3 matrices
public class task8 {
    public static void main(String[] args) {
        int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b= {{1,2,3},{4,5,6},{7,8,9}};
        int[][] c= new int[3][3];

        for (int i = 0; i < 3;i++){
            for(int j = 0; j < 3 ; j++){
                c[i][j] += a[i][j] * b[i][j];
            }
        }
        System.out.println(Arrays.deepToString(c));
    }
}
