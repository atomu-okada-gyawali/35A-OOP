package Tasks.Week3;
import java.util.Scanner;

public class Qn3divisible5or11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        String ans = num % 5== 0? "divisible by 5": num % 11 == 0 ? "divisible by 11": "not divisible by 5 nor 11";
        System.out.println("The number is "+ ans);
        scan.close();
    }
}
