package class28SetAndMap;

import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDemo1 {

    public static void main(String[] args) {

        ArrayList<Double> numbers =new ArrayList<>();

        numbers.add(10.0);
        numbers.add(15.2);
        numbers.add(20.0);
        numbers.add(30.0);
        numbers.add(40.0);
        numbers.add(10.3);

        //with the arraylist we can't do 2 operation in paralil that is why we use Iterator .below we use the remove and do compareision at
        //the same time. with below code we get error

        for(Double number:numbers){
            if(number>11){
                numbers.remove(number);
            }
        }

        //second way which is lamda expression but we only can use it with Java 8 and above

        // ( x) is the variable name and it can be any name
        numbers.removeIf(x->x>11);//all those elelments whichis greater than 11 in the Arraylist will be removed
        System.out.println(numbers);


        //third way which is Iterator

        Iterator<Double> iterator= numbers.iterator();//will returns iterator

        System.out.println(iterator.hasNext());//tills if there is any elements left to iterate, it gives us true as output
        //this pointer (hasNext) will shift if we use (next)
        iterator.next();

        //below we can use the while loop using hasNext, but the elternitive for below way is Lamda expretion

        while (iterator.hasNext()){
           double number= iterator.next();
           if(number>11){
               iterator.remove();
           }
        }
        System.out.println(numbers);

    }
}
