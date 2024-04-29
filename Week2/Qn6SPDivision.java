package Tasks.Week2;
import java.util.Scanner;
public class Qn6SPDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = scan.nextInt();
        System.out.println("Enter number b: ");
        int b = scan.nextInt();
        int sum = a+b;
        int product = a*b;
        System.out.printf("Sum: %d\nProduct: %d\n",sum, product);
        float quotient = (product/sum);
        System.out.printf("Quotient of sum and product: %f",quotient);
        scan.close();
    }
    
}
