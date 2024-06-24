package Tasks.Week6;

import java.util.ArrayList;

public class task10{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(45);
        arr.add(1);
        arr.add(23);
        ArrayList<Integer> arrAsc = new ArrayList<>(arr);
        ArrayList<Integer> arrDesc = new ArrayList<>(arr);
        
        System.out.println(arr);
        int temp;
        for(int o=0; o<arrAsc.size();o++){
            for(int i=o+1; i<arrAsc.size();i++){
                if(arrAsc.get(i)< arrAsc.get(o)){
                    temp = arrAsc.get(i);
                    arrAsc.set(i,arrAsc.get(o));
                    arrAsc.set(o,temp);
                }
            }
        }
        System.out.println("Ascending order: "+ arrAsc );
        for(int o=0; o<arrDesc.size();o++){
            for(int i=o+1; i<arrDesc.size();i++){
                if(arrDesc.get(i)> arrDesc.get(o)){
                    temp = arrDesc.get(i);
                    arrDesc.set(i,arrDesc.get(o));
                    arrDesc.set(o,temp);
                }
            }
        }
        System.out.println("Descending order: "+ arrDesc);

    }
    
}