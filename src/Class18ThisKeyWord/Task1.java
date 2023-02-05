package Class18ThisKeyWord;

public class Task1 {
    /*
    Write a Student class that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.
     */

    String name;
    String address;


    Task1(String name, String address){
      this.name=name;
      this.address=address;
    }

    void displayInfo(){
        System.out.println("Name of Studend is "+name+" and the address is "+address);
    }

    public static void main(String[] args) {

        Task1 Tamana=new Task1("Tamana","easter rd Irving");
        Tamana.displayInfo();

    }


}
