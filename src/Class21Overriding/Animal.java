package Class21Overriding;

public class Animal {
    String name;
    String color;
    int age;
    double weight;

    //method below , usually we put generic(general) behaviours so that it can match all the class and sometimes each class can have specific behaviours
    //and we need to modify(change) it


    void speak(){
        System.out.println("Animals can speak");
    }

    void eat(){
        System.out.println("Animals can eat");

    }

}

class Cat extends Animal{    //if you don't like to inherate something from your parent class, you can
    //if a child class dosnit like to have something from parent class then overloading allow us to bring that kind of immplementation in our code

    void speak(){//we are overriding speak method in Cat class
        System.out.println("Meow Meow.............");
    }

}
 class Dog extends Animal{

 }

 class Tester{
     public static void main(String[] args) {
         Cat cat=new Cat();
         cat.speak();//get line 28 if a variable is
     }
 }