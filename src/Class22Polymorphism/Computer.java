package Class22Polymorphism;

public class Computer {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */

   void TurnOn(){
       System.out.println("All computers have specific button to be turned on ");
   }

   void Programme(){
       System.out.println("All cumputers have specific programming to be installed ");
   }
}


class Apple extends Computer{

    @Override
    void TurnOn() {
        System.out.println("Apple is one of new brand computers ");
    }

    @Override
    void Programme() {
        System.out.println("Apple has it's now specific programming setups");
    }
}


class Lenovo extends Computer{
    @Override
    void TurnOn() {
        System.out.println("Lenovo is easy to use");
    }

    @Override
    void Programme() {
        System.out.println("It has same programming as other computers ");
    }

    void MarketDemand(){
        System.out.println("Lenovo is one of less demanded computers");
    }
}


class HP extends Computer{
    @Override
    void TurnOn() {
        System.out.println("HP has different plugin devises ");
    }

    @Override
    void Programme() {
        System.out.println("Setup of programming is easy in PH computers ");
    }
}


class Dell extends Computer{
    @Override
    void TurnOn() {
        System.out.println("Dell has one of the best programming features");
    }
}