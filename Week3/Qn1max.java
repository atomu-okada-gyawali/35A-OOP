package Tasks.Week3;
import java.util.Scanner;
public class Qn1max {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = scan.nextInt();
        System.out.println("Enter number b: ");
        int b = scan.nextInt();
        System.out.println("Enter number c: ");
        int c = scan.nextInt();
        int ans = a>b && a>c ? a : b>c ? b: c;
        System.out.println("Biggest number: "+ ans);
        scan.close();
    }
}
