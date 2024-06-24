package Tasks.Week6;
// 3. Write a Java program to find the maximum and minimum value of an array.
public class task3 {
public static void main(String[] args) {
    int[] array = {1,2,5,4,3,6,7,77,3,-1};
    int greatest;
    int current;
    int smallest;
    greatest = array[0];
    smallest = array[0];
    for (int i = 1; i < array.length; i++){
        current = array[i];
        if(current > greatest){
            greatest = current;
        }
        if(current < smallest){
            smallest = current;
        }
    }
    System.out.println(greatest);
    System.out.println(smallest);
    
}
}
