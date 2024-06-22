package Tasks.Week5;
// 1. Make a method to check if a number is prime or not.
public class task1 {

    
    public static void isPrime(int number){
        Boolean isPrime = true;
        if(number == 1){
            System.out.println("undefined");
        }
        if (number == 2){
            System.out.println(number+" Prime");
            return;
        }
        for (int i = 2; i <= number; i++){
            if(number%2 == 0){
                isPrime = false;
                break;

        }
    }
    if(isPrime){
        System.out.println(number+" Prime");
    }else{
        System.out.println(number +" Composite");
    }

}
}
