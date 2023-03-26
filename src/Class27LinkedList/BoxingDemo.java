package Class27LinkedList;

import java.util.ArrayList;

public class BoxingDemo {
    public static void main(String[] args) {

        Integer integer=new Integer(10);//here we creat object
        int number=integer;//it is autoboxing

        double d=12.3;
        Double wrapperD=new Double(d);//boxing
        Double wrapperP=d;//outoBoxing



        Float f=12f;//here it works but if we put it in arraylist
        ArrayList<Double> arrayList=new ArrayList<>();
        arrayList.add(12.0);








    }



}
