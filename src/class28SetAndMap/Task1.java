package class28SetAndMap;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Task1 {
    public static void main(String[] args) {

//How can you remove all duplicates from ArrayList?
        ArrayList<String > alist=new ArrayList<>();
        alist.add("John");
        alist.add("Jane");
        alist.add("James");
        alist.add("Jasmine");
        alist.add("Jane");
        alist.add("James");
        System.out.println(alist);

        System.out.println("---------------------------------------------------");

        LinkedHashSet<String > duplicatesNames=new LinkedHashSet<>(alist);
        System.out.println(duplicatesNames);
    }
}
