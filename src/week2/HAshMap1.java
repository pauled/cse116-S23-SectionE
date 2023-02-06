package week2;

import java.util.HashMap;

public class HAshMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer> bills=new HashMap<>();
        bills.put("Allen",17);
        bills.put("Diggs",14);
        System.out.println("Diggs: "+bills.get("Diggs"));
        for (String key : bills.keySet()){
            System.out.println(key+": "+bills.get(key));
        }
    }
}
