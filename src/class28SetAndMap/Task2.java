package class28SetAndMap;

import java.util.LinkedHashSet;

public class Task2 {
    public static void main(String[] args) {

        /*
Create a Set of cities in which you want to make sure that insertion order is maintained.
Then remove any city that starts with “A”;

         */

        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("New York");
        cities.add("Kabul");
        cities.add("Agrah");
        cities.add("Ankara");
        cities.add("Arizona");
        cities.add("Los Angles");
        cities.add("Los Vigas");

      cities.removeIf(city->city.startsWith("A"));
        System.out.println(cities);

/*   here we are using enhance for loop

        for (String city : cities) {
            if (city.startsWith("A")) {
                cities.remove(city);
            }

        }
        System.out.println(cities);*/

    }
    }

