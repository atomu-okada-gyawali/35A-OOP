package Tasks.Week1;
public class Hello{
    public static void main(String[] args) {
        // 1. WAP to display Hello World.Save the program as Hello.java
        System.out.println("Hello World!");
        /* 
         2. WAP to display 
            This is my first program.
            I am on module ST4003CEM
        */
        System.out.print("This is my first program.\nI am on module ST4003CEM\n");
        /*
        3.Write a program that prints the following output:
        A "quoted" String is
        'much' better if you learn     
        the rules of "escape sequences."       
        Also, "" represents an empty       
        String. Don't forget: use \"       
        instead of " !      
        '' is not the same as "  */
        System.out.print("A \"quoted\" String is\n'much' better if you learn\nthe rules of \"escape sequences.\"\nAlso,\"\" represents an empty\nString.Don't forget: use \\\"\ninstead of \" !\n\" is not the same as \"\n");

        /*4. WAP that prints the following pattern:

        *

        **

        ***

        *****/
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
              }
            System.out.print('\n');
          }
        /*5. WAP prints the following pattern:

        *********

        *********

        *********

        *********

        */
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print('*');
              }
            System.out.print('\n');
          }
    }   
    }