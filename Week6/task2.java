package Tasks.Week6;

import java.util.Scanner;

// 2. Write a Java program to test if an array contains a specific value.
public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scan.nextInt();
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i: arr){
            if(i==input){
                System.out.println("The number exists in the array with index ");
                break;
            }
            else{
                System.out.println("The number does not exist");
            }

        }
        
    }

}
