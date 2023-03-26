package Class26EncapsulationAndWrapper;

import java.util.ArrayList;

public class Demo6Boolean {
    public static void main(String[] args) {

        ArrayList<Boolean> booleans = new ArrayList<>();
        booleans.add(false);//line 14 execute this line which is index 0
        booleans.add(true);
        booleans.add(false);
        booleans.add(true);
        booleans.add(true);



        System.out.println(booleans.get(0));
        System.out.println(booleans.get(4));//we get true from line 13
        System.out.println(booleans.size());//shows size of arraylist
        //write a normal forloop to print all the elements from this arrayList

        for (int i = 0; i < booleans.size(); i++) {
            System.out.println(booleans.get(i));//all the elements from arrayList one by one
        }

        //use while loop to printl all elements

        int i=0;
        while (i<booleans.size()){
            System.out.println(booleans.get(i));
            i++;
        }
    }
}
