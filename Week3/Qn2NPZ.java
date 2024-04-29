package Tasks.Week3;
import java.util.Scanner;

public class Qn2NPZ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        String ans = num < 0 ? "Negative" : num > 0 ? "Positive" : "Zero";
        System.out.println("Number is "+ans);
        scan.close();
    }
}
