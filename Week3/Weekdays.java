package Tasks.Week3;
import java.util.Scanner;
public class Weekdays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputValue = scan.nextInt();
        scan.close();
        switch(inputValue){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
