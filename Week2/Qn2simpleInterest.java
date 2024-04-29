package Tasks.Week2;
import java.util.Scanner;
public class Qn2simpleInterest {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter Principal: "  );
       float principal = scan.nextFloat(); 
       System.out.println("Enter Amount: "  );
       float amount = scan.nextFloat(); 
       System.out.println("Enter time: "  );
       float time = scan.nextFloat();
       float interest = (principal * amount * time)/100;
       System.out.println("Simple Interest: "+ interest);
       scan.close();
    }
}
