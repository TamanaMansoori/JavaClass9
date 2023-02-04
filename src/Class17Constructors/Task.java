package Class17Constructors;

public class Task {

    /*
1) Write a java class that will have a constructor: one with parameters and second without any parameters.
Create a separate Test class where you will execute both of the constructors 1 by 1.
     */

    String name;
    String fullName;

    Task(String taskName, String taskFullName){
        name=taskName;
        fullName=taskFullName;
    }
    void printInfo(){
        System.out.println(name+" "+fullName);
    }

}


