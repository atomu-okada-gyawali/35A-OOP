package Tasks.Week6;

import java.util.ArrayList;
import java.util.Scanner;

public class task11 {
/*1. Develop a simple menu-driven application in Java that operates on an array of elements. The program will display a Menu with those options and prompt the user to choose his/her option.
The program should provide the functionalities:
1.    Add an element to the array
2.    Display all the elements of the array
3.    Reverse the elements of the array
4.    Find the largest element of the array
5.    Find the smallest element of the array
6.    Exit the program */
public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    do{    
        System.out.println("Array Operations \n1. Add element\t2. Display array\n3. Reverse array\t4. Largest element\n5. Smallest element\t6. Exit the program");
    int menuSelected = scan.nextInt();
    switch (menuSelected) {
        case 1:
            System.out.println("Enter a number to be added");
            int num = scan.nextInt();
            list.add(num);
            System.out.println("Your number is added");
            continue;
        case 2:
            System.out.println(list);
            continue;
        case 3:
            ArrayList<Integer> reversedList = new ArrayList<>(list);
            for(int i = reversedList.size()-1; i >=0 ;i--){
                reversedList.set(reversedList.size()-1-i, list.get(i));
            }
            list = reversedList;
            System.out.println("array is reversed");
            continue;
        case 4:
            int greatest = list.get(0);
                for(int i = 0; i<list.size();i++){
                    int current = list.get(i);
                    if(current>greatest){
                        greatest = current;
                    }
                }
            System.out.println("Greatest: "+greatest);
            continue;
        case 5:
            int smallest = list.get(0);
            for(int i = 0; i<list.size();i++){
                int current = list.get(i);
                if(current<smallest){
                    smallest = current;
                }
            }
            System.out.println("Smallest: "+smallest);
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

