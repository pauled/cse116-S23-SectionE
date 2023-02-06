package week2;

import java.util.ArrayList;

public class ArrrayList1 {
    public static int sum(ArrayList<Integer> arrIn){
        int out=0;
        for (int x=0;x<arrIn.size(); x++){
            out+=arrIn.get(x);
        }
        return out;
    }
    public static void main(String[] args) {
        int y=0;
        ArrayList<Integer> arr1=new ArrayList<>();
        for (int x=0;x<4;x++){
            arr1.add(10-x);
        }
        System.out.println(arr1);
        int temp=sum(arr1);
        System.out.println("total: "+temp);
        ArrayList<Integer> arr2=arr1;
        arr2.add(42);
        System.out.println(arr1);
    }
}
