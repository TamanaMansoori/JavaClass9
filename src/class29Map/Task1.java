package class29Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task1 {
    /*
Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
     */

    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("USA", "Washington DC");
        countries.put("Egypt", "Cairo");
        countries.put("France", "Paris");
        countries.put("Italy", "Milano");
        countries.put("Lebanon", "Beirut");

        //we get all the entries
        // Set<Map.Entry<String ,String >> entrySet=countries.entrySet(); this is longer way and we don't use it

        //below is shorter way
        // (var) works for java 10 and above
        var entrySet = countries.entrySet();
        for (var entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        //using Iterator

        var iterator = countries.entrySet().iterator();
        while (iterator.hasNext()) {
            var entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}