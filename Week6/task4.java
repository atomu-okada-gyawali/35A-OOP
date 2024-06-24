package Tasks.Week6;

import java.util.Arrays;

// 4. Write a Java program to revers the element of a one-dimensional array.
public class task4 {
public static void main(String[] args) {
    int[] arr = {1,2,3,4,55,66};
    int[] rarr = new int[arr.length];
    for(int i = arr.length -1; i >=0; i--){
        rarr[arr.length-1-i] = arr[i]; 
    }
    System.out.println(Arrays.toString(rarr));
}
}
