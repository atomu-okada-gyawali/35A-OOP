package Tasks.Week5;
// 10. Write a Java program to display all prime numbers less than a given number and count all the prime numbers less than that number using functions. 
// Your program should contain two functions: 
// a.    print_prime_less_than that takes a number as a parameter and prints the prime number less than that number 

// b.    is_prime that takes a number as a parameter and then returns whether that number is prime.
public class task10 {
    public static void main(String[] args) {
        print_prime_less_than(50);
    }
    public static Boolean is_prime(int number){
        Boolean isPrimeV = true;
        if(number == 1){
            isPrimeV = false;
        }

        else if (number == 2){
            isPrimeV = true;
        }

        else{
            for (int i = 2; i <= Math.sqrt(number); i++){
                if(number%2 == 0){
                    isPrimeV = false;
                    break;
            }
    }
}
    return isPrimeV;
}
    public static void print_prime_less_than(int uLimit){
        int count = 0;
        System.out.println("Prime numbers under " + uLimit +":");
        for(int i = 1; i < uLimit; i++){
            if(is_prime(i)){
                System.out.print(i +"\t");
                count++;
            }
        }
        System.out.println("\n"+"Count: "+count);
    }
}
