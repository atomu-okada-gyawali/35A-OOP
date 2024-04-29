package Tasks.Week2;
import java.util.Scanner;
public class Qn3AofTVofC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 

        System.out.println("Enter height of the triangle: "  );
        float tHeight = scan.nextFloat(); 
        System.out.println("Enter breadth of the triangle: "  );
        float tBreadth = scan.nextFloat(); 
        System.out.println("Enter height of the cuboid: "  );
        float cHeight = scan.nextFloat(); 
        System.out.println("Enter width of the cuboid: "  );
        float cWidth = scan.nextFloat(); 
        System.out.println("Enter length of the cuboid: "  );
        float cLength = scan.nextFloat(); 
        
        float tArea = 0.5f * tBreadth *tHeight;
        float cVolume = cHeight*cLength*cWidth;
        float cubeVolume = cLength*cLength*cLength;
        System.out.printf("Area of traingle: %f\nVolume of cuboid: %f\nVolume of cube: %f", tArea, cVolume, cubeVolume);
        scan.close();
    }
}
