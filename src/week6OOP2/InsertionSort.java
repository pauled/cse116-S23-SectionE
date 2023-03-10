package week6OOP2;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertionSort <T>{
    private Comparator<T> comparator;

    public InsertionSort(Comparator<T> input){
        this.comparator=input;
    }
    public ArrayList<T> sort(ArrayList<T> input){
        ArrayList<T> output=new ArrayList<>();
        for (T toInsert : input){
            int location=0;
            for (T toCompare : output){
                if (this.comparator.compare(toCompare,toInsert)){
                    location++;
                }
            }
            output.add(location,toInsert);
        }
        return output;
    }
    public static void main(String[] args) {
        IntDecreasing temp=new IntDecreasing();
        InsertionSort<Integer> sorter=new InsertionSort<>(temp);
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,6,5));
        ArrayList<Integer> output=sorter.sort(list);
        System.out.println(output);
    }
}
