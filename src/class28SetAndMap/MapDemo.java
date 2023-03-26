package class28SetAndMap;

import java.util.HashMap;

public class MapDemo {

    public static void main(String[] args) {

        //here we can store 2 values at a time
        //it is not index based, we put the keys and get the values
        HashMap<String, Integer> grocieries= new HashMap<>();
        grocieries.put("Eggs",10);
        grocieries.put("Milk",5);
        grocieries.put("Bread",6);
        grocieries.put("Meat",20);

        System.out.println(grocieries.get("Milk"));//we get the value (5) in the console
        System.out.println(grocieries);//we get all the values and keys both from this Map
        System.out.println(grocieries.size());//show number of entries
        System.out.println(grocieries.isEmpty());
        System.out.println(grocieries.remove("Meat"));
        System.out.println();

    }
}
