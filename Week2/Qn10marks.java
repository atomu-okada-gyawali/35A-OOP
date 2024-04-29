package Tasks.Week2;
import java.util.Scanner;
public class Qn10marks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter marks for subject A: ");
        float a = scan.nextFloat();
        System.out.println("Enter marks for subject B: ");
        float b = scan.nextFloat();
        System.out.println("Enter marks for subject C: ");
        float c = scan.nextFloat();
        System.out.println("Enter marks for subject D: ");
        float d = scan.nextFloat();
        float total = a+b+c+d;
        float percent = total/4;
        String division = percent>=70 ? "First Class" : percent>59? "Second Class" : percent> 49 ? "Upper Second Class" : percent > 39 ? "Second Class" : percent > 39 ? "Third Class" : percent < 40 ? "Fail" : "invalid marks";
        System.out.println("Total: "+ total);
        System.out.println("Percentage: "+ percent + "%");
        System.out.println("Your division is: "+ division);
        scan.close();
    }
    
}
