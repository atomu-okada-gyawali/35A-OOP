package Tasks.Week4;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        scan.close();
        int rem;
        int rev = 0;
        while(number != 0){
            rem = number % 10;
            rev = rev*10+ rem;
            number /=10;
        } 
        System.out.println("Reversed: "+rev);
    }
}
