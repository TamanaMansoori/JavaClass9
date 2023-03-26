package Class26EncapsulationAndWrapper;

public class Demo1ArrayList {

    public static void main(String[] args) {


        String name1 = "Razia";
        String name2 = "Sarah";
        String name3 = "Nima";
//create Array below
        String[] name = {"Tamana ", "Aiper", "Laura"};

        displayName(name);
        display(name1,name2,name3);//display of method in line 30
    }

    //below we create method of string name
    public static void displayName(String[] name) {
        //write the code to print all of the names form array

        //below is enfance for loop
        for (String names : name) {
            System.out.println(names);
        }
    }

    //create anothor method to print name on line 8,9,10

    public static void display(String name1, String name2, String name3) {

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }
}