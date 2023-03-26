package Class23Abstruction;

public abstract class Animal {
    //Abstraction only define things and hide the implementation


    /*
    define the speak eat methods and create 3 subclasses and override the speak eat method
     */

   abstract void speak();//{
      //  System.out.println("Animal speaks");//this is useless, in Abstruction we can ignore this part and only header is important
    }


 class Dog extends Animal{

     @Override
     void speak() {
         System.out.println("Wuff wuffff");
     }
 }

 class Cut extends Animal{
     @Override
     void speak() {
         System.out.println("Meow mewo");
     }
     void sleep(){
         System.out.println("Cut sleep");
     }
 }