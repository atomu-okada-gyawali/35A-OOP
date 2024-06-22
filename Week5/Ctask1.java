package Tasks.Week5;

public class Ctask1 {
    public static String eligibleTest(String name, int age){
        if(age <0 || age >200){
            return "Invalid age";
        }else if(age < 18){
            return "Hello "+ name +" you are ineligible";
        }else{
            return "Congratulations "+ name+ " you are eligible";
        }
    }
    public static void main(String[] args) {
        System.out.println(eligibleTest("atom", 21));
        System.out.println(eligibleTest("atom", -21));
        System.out.println(eligibleTest("atom", 444));
        System.out.println(eligibleTest("atom", 12));
    }
}
