package Class20Overloading;

public class Animal {

    String name;
    String color = "Black";//we usally don't assign value to the instance variable but here as exception, we assign the value to see what we get in
    //the console using (this) and (super) key. 

    void printColor() {
        String color = "Blue";
        System.out.println(color);
        System.out.println(this.color);//prints the child class
       //System.out.println(super.color);//prints the parent class

        //if we put same value to all color variable in all classes, we get 3 printout with same value 
        //why 3 printout?? because we have 3 sout in line 11,12,13
    }

    class Cat extends Animal {
        int age;
        double weight;
        String color;
    }

    public static void main(String[] args) {

    }
}

