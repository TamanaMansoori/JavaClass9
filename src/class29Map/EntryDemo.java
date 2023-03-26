package class29Map;

import java.util.LinkedHashSet;
import java.util.Set;

public class EntryDemo {
    public static void main(String[] args) {

        Set<Entry> entrySet=new LinkedHashSet<>();
        entrySet.add(new Entry(1,"Nazir"));
        entrySet.add(new Entry(2,"Shah"));
        entrySet.add(new Entry(3,"Tami"));
        entrySet.add(new Entry(4,"Gul"));
        entrySet.add(new Entry(5,"Bahar"));
        entrySet.add(new Entry(6,"Saba"));



        ////remove all those objects for which
        //  value of key is greater than 2 and value contains letter (i)

        entrySet.removeIf(x->x.getKey()>2&& x.getValue().contains("i"));
        System.out.println(entrySet);

        //below we can see proper output
//the answer is in Entry class line 22 to 31


    }
}
