package Tasks.Week3;

import java.util.Scanner;

public class Qn6vowConst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                         ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') ? "Vowel" : "Consonant";
        System.out.println(ch + " is a " + result);
        
        scanner.close();
    }
}