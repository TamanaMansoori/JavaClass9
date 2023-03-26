package class29Map;

import java.util.TreeMap;

public class Task1SecondPart {
    public static void main(String[] args) {


            /*
Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
     */

        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("USA", "Washington DC");
        countries.put("Egypt", "Cairo");
        countries.put("France", "Paris");
        countries.put("Italy", "Milano");
        countries.put("Lebanon", "Beirut");

        var values=countries.values();
        for(var value:values){  //using (var) we don't need to specify the data type
            System.out.println(value);
        }

        var iterator=countries.values().iterator();
        while (iterator.hasNext()){

            var value=iterator.next();
            System.out.println(value);
        }
    }
}
