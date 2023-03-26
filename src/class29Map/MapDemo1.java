package class29Map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

    public static void main(String[] args) {

        Map<Integer,String> studentsMap=new HashMap<>();
        studentsMap.put(1,"Nazir");
        studentsMap.put(2,"Anush");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");

        System.out.println(studentsMap);
        System.out.println(studentsMap.get(3));//we get Tami
        System.out.println(studentsMap.size());//how many entries we have in this map
        //to search for keys
        System.out.println(studentsMap.containsKey(5)); //we get falis bcoz we don't have element 5
        System.out.println(studentsMap.containsValue("Aisha"));//we get the value and since this value is in our Map so we get true in the console

        System.out.println(studentsMap.remove(2));

        //to replace value
        studentsMap.replace(2,"Asli");//we get Asli instead of Anush

        System.out.println(studentsMap);


    }
}
