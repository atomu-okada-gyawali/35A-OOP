package Tasks.Week5;

public class Ctaks2 {
    public static String monthCalculator(int month){
        switch(month){
            case 1:
                return "January";
                
            case 2:
                return "February";
                
            case 3:
                return "March";
                
            case 4:
                return "April";
                
            case 5:
                return "May";
                
            case 6:
                return "June";
                
            case 7:
                return "July";
                
            case 8:
                return "August";
                
            case 9: 
                return "September";
                
            case 10:
                return "October";
                
            case 11:
                return "November";
                
            case 12:
                return "December";
                
            default:
                return "Invalid";
                
        }
    }
    public static void main(String[] args) {
        System.out.println(monthCalculator(3));
        System.out.println(monthCalculator(2));
        System.out.println(monthCalculator(1));
    }
}
