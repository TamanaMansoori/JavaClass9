package Class26EncapsulationAndWrapper;

import java.util.ArrayList;

public class Demo5ArrayListChar {

    public static void main(String[] args) {
        ArrayList<Character> characters=new ArrayList<>();
        characters.add('A');
        characters.add('B');
        characters.add('Z');
        characters.add('C');
        characters.add('T');

        //below we use enhanceForloop

        for(Character chart:characters){
            System.out.println(chart);

            System.out.println("___________________________________________");

            System.out.println(chart+" ");
        }
    }
}
