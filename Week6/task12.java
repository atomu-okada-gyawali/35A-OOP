package Tasks.Week6;

import java.util.ArrayList;
import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
/*2. Develop a simple menu-driven student grading system program in Java that operates on an array of student grades. The program will display a Menu with those options and prompt the user to choose his/her option.
The program should provide the functionalities:
1.    Add a grade to the system
2.    Display all grades
3.    Calculate the average grade
4.    Find the highest grade
5.    Find the lowest grade
6.    Exit the program */
    ArrayList<Integer> list = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    do{    
        System.out.println("Student Grading System \n1. Add Grade\t2. Display grades\n3. Calculate Average\t4. Highest grade\n5. Lowest grade\t6. Exit the program");
    int menuSelected = scan.nextInt();
    switch (menuSelected) {
        case 1:
            System.out.println("Enter a grade to be added");
            int num = scan.nextInt();
            list.add(num);
            System.out.println("Your grade is added");
            continue;
        case 2:
            System.out.println("Grade List: "+list);
            continue;
        case 3:
            int sum = 0;
            double average = 0;
            for(int grade: list){
                sum+=grade;
                average = sum/list.size();
            }
            System.out.println("Average grade: "+ average);
            continue;
        case 4:
            int greatest = list.get(0);
                for(int i = 0; i<list.size();i++){
                    int current = list.get(i);
                    if(current>greatest){
                        greatest = current;
                    }
                }
            System.out.println("Highest grade: "+greatest);
            continue;
        case 5:
            int smallest = list.get(0);
            for(int i = 0; i<list.size();i++){
                int current = list.get(i);
                if(current<smallest){
                    smallest = current;
                }
            }
            System.out.println("Lowest grade: "+smallest);
            continue;
        
        case 6:
            break;
                
        default:
            System.out.println("Invalid (1-6)");
            continue;
    
        }
        break;
    }while(true);
    scan.close();
    }
}
