package class29Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapDemo6 {

    public static void main(String[] args) {

        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Nazir");
        studentsMap.put(2,"Anush");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Ta");

        //remove the value from entries
        // we use collection

        Collection<String> values=studentsMap.values();
        System.out.println(values);


        //remove all values which has (i)
        values.removeIf(x->x.contains("i"));
        System.out.println(studentsMap);

        //remove if key is greater than 2 and the value contains letter (i)
        // we can't do that becaous in line 22 we only have the value not the keys
        //in orther to do so first we have to get the key in Collection the apply the condition




    }
}
