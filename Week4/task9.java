package Tasks.Week4;

import java.util.ArrayList;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        ArrayList<Integer> above50= new ArrayList<>();
        ArrayList<Integer> below50= new ArrayList<>();
        Boolean exists50=false;
        for(int i = 0; i < 10; i++){
            System.out.println(i+1+". Enter a number:");
            num = scan.nextInt();
            if (num<50){
                below50.add(num);
            }
            else if(num>50){
                above50.add(num);
            }else{
                exists50 = true;
            }
        }
        System.out.println("number above 50: "+above50);
        System.out.println("number below 50: "+below50);
        if(exists50){
            System.out.println("50 exists");
        }
        int avAvobe50 = (above50.stream().reduce(0, (subtotal, element) -> subtotal + element))/above50.size();
        int avBelow50 = (above50.stream().reduce(0, (subtotal, element) -> subtotal + element))/below50.size();
        
        System.out.println("Average of numbers above 50: "+ avAvobe50);
        System.out.println("Average of numbers below 50: "+ avBelow50);
        scan.close();
    }
}
