package class29Map;

import java.util.HashMap;
import java.util.Set;

public class MapsDemo4 {
    public static void main(String[] args) {

        HashMap<String, Double> makeup=new HashMap<>();
        makeup.put("Lipstick",50.0);
        makeup.put("foundation",60.0);
        makeup.put("mascara",70.0);
        makeup.put("eyeliner",12.5);
        makeup.put("Blush-on",10.5);

        //how can i get all keys from this Map? we can use KeySet Method form Map interface
        Set<String> allKeys=makeup.keySet();
        System.out.println(allKeys);


        /// shows same as KeySet
        for (String allKey : allKeys) {
            System.out.println(allKey);
        }

        //wtire a code that can delete all the entries from makeup whose size of key  is more than 7
        allKeys.removeIf(x->x.length()>7);
        System.out.println(allKeys);
        //below is original map printed
        System.out.println(makeup);//here all entries will be remove if the size is more than 7


    }
}
