package Tasks.Week2;
import java.util.Scanner;
public class Qn4ternFor1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age?");
        int age = scan.nextInt();
        String ans = age > 18? "You are eligible to vote": "You are not eligible to vote ";
        System.out.println(ans);
        scan.close();
    }   
}
