package class28SetAndMap;

import java.util.HashSet;

public class SetsDemo1 {

    public static void main(String[] args) {

// it removes duplicate values and also it dosen't maintain insertin order, means the order is randamly
        //if you have to remove duplicare value then hashset is the best option
        HashSet<String>fruit=new HashSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Orange");
        fruit.add("Mango");
        System.out.println(fruit);
    }
}
