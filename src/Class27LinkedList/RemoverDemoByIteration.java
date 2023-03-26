package Class27LinkedList;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoverDemoByIteration {

    public static void main(String[] args) {
//here we show the proper way of removing or adding elements from an array
//here we use iteration


        //iteration works from Java 6 to 19

        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Lava");
        words.add("Computer");

        Iterator<String> iterator= words.iterator();//returens an object of type iterator and has 3 method
      //we can't use for loop here bcoz loops can't adjust itself
        while (iterator.hasNext()){ //here we use iterator instead of loop
            String s= iterator.next();//returns element one by one
            if(s.endsWith("a")){
                iterator.remove();//this will remove the specified element
            }
        }
        System.out.println(words);



        //second way is below which is easier which is Lamda expression it works at least with java 8 and higher version

        words.removeIf(s -> s.endsWith("a"));
        System.out.println(words);

        //  (->) is part of the syntax




    }

}
