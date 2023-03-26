package class28SetAndMap;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        //removes the duplicate and also stores the values based on alphabical order and if the data type is Integer then the
        //number is being sorted based on increased order

        TreeSet<Integer> numbers=new TreeSet<>();
        numbers.add(50);
        numbers.add(40);
        numbers.add(100);
        numbers.add(50);
        numbers.add(20);
        numbers.add(30);
        numbers.add(50);

        System.out.println(numbers);
    }
}
