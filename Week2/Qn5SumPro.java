package Tasks.Week2;
import java.util.Scanner;
public class Qn5SumPro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = scan.nextInt();
        System.out.println("Enter number b: ");
        int b = scan.nextInt();
        int sum = a+b;
        int product = a*b;
        System.out.printf("Sum: %d\nProduct: %d",sum, product);
        scan.close();
    }
}
