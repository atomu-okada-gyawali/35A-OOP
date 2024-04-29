package Tasks.Week2;
import java.util.Scanner;
public class Qn9areaFromDtoI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length: ");
        double length = scan.nextDouble();
        System.out.println("Enter breadth:");
        double breadth = scan.nextDouble();
        System.out.println("Area: "+ Math.round(length *breadth));
        scan.close();
    }
}
