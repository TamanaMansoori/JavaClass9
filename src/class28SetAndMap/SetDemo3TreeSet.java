package class28SetAndMap;

import java.util.TreeSet;

public class SetDemo3TreeSet {
    public static void main(String[] args) {

        //no duplicate and it sorts the values based on Alphabitic order

        TreeSet<String> fruit=new TreeSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Mango");
        fruit.add("Banana");
        fruit.add("Apple");

        System.out.println(fruit);
    }
}
