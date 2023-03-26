package Class26EncapsulationAndWrapper;

import java.util.ArrayList;

public class Demo7Replace {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Fizzy");
        names.add("Savo");
        names.add("Sam");
        names.add("Tarik");
        names.add("Abeera");

        System.out.println(names.contains("Daria"));//here we get false bcz it is not in the list line 7
        System.out.println(names);//all the names will appear here
        //below we remove one name
        names.remove("Sam");
        System.out.println(names);

        //here we replace
        names.set(3,"James Bond"); //here we frist write the index of the elements that we want to replace and then write the value we want to.
        System.out.println(names);

        //how to find the index of a specific elements
        System.out.println(names.indexOf("Savo"));

    }





}
