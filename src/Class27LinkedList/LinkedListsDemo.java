package Class27LinkedList;

import java.util.LinkedList;

public class LinkedListsDemo {

    public static void main(String[] args) {

        LinkedList<String> output=new LinkedList<>();
        output.add("Artem");
        output.add("Elvira");
        output.add("Tamana");
        output.add("Temmuz");
        output.add("Sam");
        System.out.println(output);


        //below is enhance for loop
      for(String name:output){
          System.out.println(name);

        }
    }
}
