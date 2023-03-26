package class28SetAndMap;

import java.util.TreeSet;

public class TaskSet1 {
    public static void main(String[] args) {
        /*
        Create a Set collection in which you need to add names of the countries.
        In this set we want all objects to be sorted in alphabetical order.
        Using 2 different ways retrieve all elements from set.
         */

        //first way
        TreeSet<String> countries=new TreeSet<>();
        countries.add("Afghanistan");
        countries.add("USA");
        countries.add("Italy");
        countries.add("Mexico");
        countries.add("India");

        System.out.println(countries);

        //second way is for each loop

        for(String s:countries){
            System.out.println(s);
        }
    }
}
