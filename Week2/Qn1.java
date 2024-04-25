package Tasks.Week2;
import java.util.Scanner;
public class Qn1 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scan1.nextLine();
        System.out.print("Are you over 18?: ");
        boolean status = scan1.nextBoolean();
        System.out.print("How many siblings?: ");
        int siblings = scan1.nextInt();
        System.out.printf("Hello %s,\nStatus: %b\nYou have sibling num of %d",name, status, siblings);
        scan1.close();
    }
}
