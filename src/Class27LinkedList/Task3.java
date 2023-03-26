package Class27LinkedList;

import java.util.ArrayList;

public class Task3 {

    public static void main(String[] args) {
        //3)Create an arrayList of words. Remove every word that ends with “e”.

        ArrayList<String> words=new ArrayList<>();
        words.add("Store");
        words.add("Gym");
        words.add("Java");
        words.add("Type");

        //NOTE: prefered way is Lamda Expretion and ArrayList not for loop
        // first way is Lamda Expretion

        words.removeIf(x->x.endsWith("e"));

        //second way is using for loop

        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).endsWith("e")){
                words.remove(i);
            }
        }
        System.out.println(words);
    }
}
