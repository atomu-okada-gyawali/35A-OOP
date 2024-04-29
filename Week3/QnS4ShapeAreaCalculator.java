package Tasks.Week3;

import java.util.Scanner;

public class QnS4ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select a shape to calculate its area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();
        
        float area;
        
        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                float radius = scanner.nextFloat();
                area = (22/7) * radius * radius;
                System.out.println("Area of the circle: " + area);
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                float length = scanner.nextFloat();
                System.out.print("Enter the width of the rectangle: ");
                float width = scanner.nextFloat();
                area = length * width;
                System.out.println("Area of the rectangle: " + area);
                break;
            case 3:
                System.out.print("Enter the side length of the square: ");
                float side = scanner.nextFloat();
                area = side * side;
                System.out.println("Area of the square: " + area);
                break;
            case 4:
                System.out.print("Enter the base length of the triangle: ");
                float base = scanner.nextFloat();
                System.out.print("Enter the height of the triangle: ");
                float height = scanner.nextFloat();
                area = 0.5f * base * height;
                System.out.println("Area of the triangle: " + area);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
        
        scanner.close();
    }
}
