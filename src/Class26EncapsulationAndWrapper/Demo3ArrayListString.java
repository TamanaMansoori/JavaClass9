package Class26EncapsulationAndWrapper;

import java.util.ArrayList;

public class Demo3ArrayListString {

    public static void main(String[] args) {

        //arrayList is a class , we can use it like any class
//<> diamond operator or angle bracket and we specify the datatype inside them
        ArrayList<String> names=new ArrayList<>();
        //add method to add elements to this arrayList
        names.add("Nelson");
        names.add("Sam");
        names.add("Diana");
        names.add("Zahra");
        names.add("Saba");
        names.add("Tamana");
        System.out.println(names);

    }
}
