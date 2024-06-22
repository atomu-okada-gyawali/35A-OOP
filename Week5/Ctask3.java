package Tasks.Week5;

public class Ctask3 {
    public static Boolean checkEqual(int a, int b) {
        if(a==b){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkEqual(1,1));
        System.out.println(checkEqual(1,2));
    }
}
