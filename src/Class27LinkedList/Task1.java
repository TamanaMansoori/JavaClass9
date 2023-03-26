package Class27LinkedList;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

        /*
1) Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
         */

        //String [] name={"Tamana","Johan","Tami","Mike","Saba"}; this is normal array
        ArrayList<String> names=new ArrayList<>();
        names.add("Tamana");
        names.add("Johan");
        names.add("Tami");
        names.add("Mike");
        names.add("Saba");

        System.out.println(names.isEmpty());// returns boolean as value in the console

        System.out.println(names.contains("Tamana"));

        System.out.println(names.size());

        System.out.println(names);

        //for line 29 we can use for loop as well




    }
}
