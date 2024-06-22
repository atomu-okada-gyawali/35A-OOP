package Tasks.Week5;
// 8. Calculate the nth Fibonacci number using the method.
public class task8 {

    public static int fib(int i){
        if(i<=1){
            return i;
        }
        return fib(i-1) + fib(i-2);
    }
    public static void fibonacci(int n){
        for (int a = 0; a < n; a++){
            System.out.print(fib(a)+" \t");
        }
    }
}
