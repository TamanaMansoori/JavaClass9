package class29Map;

import java.util.HashMap;

public class MapsDemo2 {

    public static void main(String[] args) {

        HashMap<String, Double> fruit= new HashMap<>();
        fruit.put("Apple",1.99);
        fruit.put("Orange",2.99);
        fruit.put("Banana",3.99);
        fruit.put("Kiwi",0.99);
        fruit.put("Apple",7.99);

        fruit.put(null,null);
        System.out.println(fruit);



        HashMap<String, Double> makeup=new HashMap<>();
        makeup.put("Listick",50.0);
        makeup.put("foundation",60.0);
        makeup.put("mascara",70.0);
        makeup.put("eyeliner",12.5);
        makeup.put("Blush-on",10.5);



        HashMap<String,Double> groceries=new HashMap<>();
        //all the value form first and second Map will be in this Map
        groceries.putAll(fruit);
        groceries.putAll(makeup);
        //everything from makeup and fruit will be below
        System.out.println(groceries);

    }
}
