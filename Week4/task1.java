package Tasks.Week4;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write your name");
        String name = scan.nextLine();
        for(int i = 0; i<5; i++){
            System.out.println("Hello " + name);
        }
        scan.close();
    }
}
