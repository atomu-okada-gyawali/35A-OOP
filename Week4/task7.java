package Tasks.Week4;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scan.nextInt();
        System.out.println("Enter b: ");
        int b = scan.nextInt();
        int rem;
        scan.close();
        
        do{
            //for a = b * divisor + rem
        rem = a%b;
        if(b%rem ==0){
            break;
        }
        a = b;
        b = rem;
        }while(true);
        System.out.println("HCF:"+rem);
        
        

        }
    }

