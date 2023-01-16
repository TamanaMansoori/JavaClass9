package homeWork;

public class HomeWork2Class9 {
    public static void main(String[] args) {
        /*
        2) Create an array of names and store all names of your group.
        Then print your name from that array. (use 2 different ways of creating an array).
         */

        String[] names={"Razi","Karima","Tamana","Anesa","Kabul"};
       for (int i = 0; i < names.length; i++) {
           if(names[i].equals("Tamana")){
                System.out.println(names[2]);
            }
        }
    }
}
