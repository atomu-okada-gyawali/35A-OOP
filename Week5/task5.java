package Tasks.Week5;
// 5. Write a program for calculating Simple Interest using a method and print the result from the method itself.
public class task5 {
    public static void main(String[] args) {
        sInterest(5000f,12f,2f);
    }
    public static void sInterest(float principal, float rate, float year){
        float interest = (float) (principal*rate*year*0.01);
        System.out.printf("The simple interest for principal=%.2f, rate=%.2f, year=%.2f is %.2f", principal,rate,year,interest );
    }
}
