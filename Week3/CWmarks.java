package Tasks.Week3;
import java.util.Scanner;
public class CWmarks {
    public static void main(String[] args) {
        System.out.println("Enter a: ");
        Scanner scan = new Scanner(System.in);
        float a = scan.nextInt();
        System.out.println("Enter b: ");
        float b = scan.nextInt();
        System.out.println("Enter c: ");
        float c = scan.nextInt();
        System.out.println("Enter d: ");
        float d = scan.nextInt();
        System.out.println("Enter e: ");
        float e = scan.nextInt();
        scan.close();
        float total = a+b+c+d+e;
        float average = total/5;
        System.out.printf("Total: %f,Average: %f", total, average); 
        if (a<35||b<35||c<35||d<35||e<35){
        System.out.println("\nThird dix");
    }else if(average<60){
        System.out.println("Third Division");
    }else if(average>=60 && average< 70){
        System.out.println("First Division");
    }else if(average>=70 && average< 80){
        System.out.println("Distinction");
    }if(average>100){
        System.out.println("Invalid marks");
    }
    }
}
