package class28SetAndMap;

import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {

        //removes duplicate and maintains the insertion order

        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Mango");
        fruit.add("Banana");
        fruit.add("Apple");

        System.out.println(fruit);
    }
}
