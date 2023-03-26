package class29Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo7 {

    //remove if key is greater than 2 and the value contains letter (i)
    // we can't do that becaous in line 22 we only have the value not the keys
    //in orther to do so first we have to get the key in Collection the apply the condition

    public static void main(String[] args) {

        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Nazir");
        studentsMap.put(2,"Anush");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Ta");

        //Entry hold key and values

        Set<Map.Entry<Integer,String>> entrySet=studentsMap.entrySet();

         for(Map.Entry<Integer,String> entry:entrySet){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            //key and value both
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


        entrySet.removeIf(x->x.getKey()>2&&x.getValue().contains("i"));
        System.out.println(studentsMap);


    }
}
