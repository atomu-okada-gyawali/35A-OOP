package Tasks.Week4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        for(int a = 0; a < num; a++){
            for(int b = 0; b < num; b++){
                System.out.print("*");
            }
            System.out.println("");
        }
        scan.close();
    }
}
