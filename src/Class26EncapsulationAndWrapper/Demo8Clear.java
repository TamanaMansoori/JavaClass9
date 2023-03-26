package Class26EncapsulationAndWrapper;

import java.util.ArrayList;

public class Demo8Clear {

    public static void main(String[] args) {

        //clear menas delete all the values

        ArrayList<String> names=new ArrayList<>();

        names.add("Nelson");
        names.add("Sam");
        names.add("Diana");
        names.add("Zahra");
        names.add("Daria");
        names.add("Saba");
        System.out.println(names);
        names.clear();//means delete all
        System.out.println(names);
    }
}
