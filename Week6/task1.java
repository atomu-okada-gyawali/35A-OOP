package Tasks.Week6;
// 1. Write a Java program to calculate the average value of array element.
public class task1 {
public static void main(String[] args) {
    int[] array = {1,2,3,4,5};
    double sum = 0;
    for(int element: array){
        sum+=element;
    }
    System.out.println("Average = "+(sum/array.length));
}
}
