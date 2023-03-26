package Class27LinkedList;

import java.util.ArrayList;

public class GenericArrayList {

    public static void main(String[] args) {

        //below is generic ArrayList
        ArrayList name=new ArrayList();//this was the old practice that we were using before, we could add any type of data inside the array
        // which is not a good approach
        name.add("Zafar");
        name.add(10);
        name.add('a');

        for(Object j:name){//all other classes are the child class of (Object) class and that is why we can print all datatype with Object
            System.out.println(j);
        }


       //below is diamond operator
       ArrayList<String> name1 =new ArrayList<>();//this is the new conversion of ArrayList
        //name.add(10); we get error bcoz the ArrayList is the String type

    }
}
