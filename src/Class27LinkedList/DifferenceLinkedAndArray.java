package Class27LinkedList;

import java.util.LinkedList;

public class DifferenceLinkedAndArray {

    public static void main(String[] args) {


        //linkedList=> it takes only 143 ms
        //ArrayList => take 57240 ms

       long startTime=System.currentTimeMillis();

       LinkedList<String> numbers=new LinkedList<>();
       // ArrayList<String> numbers=new ArrayList<>();//here we use Arraylist instead of LinkList, which is not a good aprouch
        for (int i = 0; i < 1000000; i++) {//1000000 shows number of iteration
            numbers.add(0,"Test Data");//shift elements in between
        }

        long endTime=System.currentTimeMillis();
        System.out.println(endTime-startTime);


    }
}
