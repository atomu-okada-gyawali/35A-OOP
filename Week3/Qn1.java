package Tasks.Week3;
import java.util.Scanner;
public class Qn1 {
    public static void main(String[] args) {
        System.out.println("Enter a: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Enter b: ");
        int b = scan.nextInt();
        System.out.println("Enter c: ");
        int c = scan.nextInt();
        System.out.println("Enter d: ");
        int d = scan.nextInt();
        System.out.println("Enter e: ");
        int e = scan.nextInt();
        scan.close();
        int total = a+b+c+d+e;
        float average = total/5;
        System.out.printf("Total: %d,Average: %f", total, average); 
    }
}
