package class29Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo5 {

    public static void main(String[] args) {

        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Nazir");
        studentsMap.put(2,"Anush");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Ta");

        //remove all entries which is greater than 2

        Set<Integer> keys=studentsMap.keySet();

        keys.removeIf(x->x>2);
        System.out.println(studentsMap);


        //remove entries based on values


    }
}
