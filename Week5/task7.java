package Tasks.Week5;
// 7. Calculates the factorial of a given number using the Java method.
public class task7 {

    public static int factorial(int num){
        int fact = 1;
        for (int i = 2; i <=num; i++){
            fact *=i;
        }
        return fact;
    }
}
