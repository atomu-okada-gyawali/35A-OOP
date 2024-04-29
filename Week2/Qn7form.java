package Tasks.Week2;
import java.util.Scanner;
public class Qn7form {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Enter your roll number: ");
        String roll = scan.nextLine();
        System.out.println("Enter your field of interest: ");
        String interest = scan.nextLine();
        System.out.printf("Hey, my name is %s and my roll number is %s. My field of interest are %s.",name, roll, interest);
        scan.close();
    }
}
