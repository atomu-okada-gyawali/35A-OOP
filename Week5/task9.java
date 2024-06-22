package Tasks.Week5;


// 9. Write a Java program to find the greatest common divisor (GCD) of two numbers.
public class task9 {
        public static void gcd(int a, int b) {
        int rem;
        
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
