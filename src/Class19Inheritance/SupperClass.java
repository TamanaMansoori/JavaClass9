package Class19Inheritance;

public class SupperClass {

    //create constructor

    SupperClass(){
        System.out.println("I am a constructor from the Parent class ");
    }
}

//subclass

class SubClass extends SupperClass{//the constroct is default here bcoz we didn't defined it

    SubClass(){
        super(); //makes a call to the parent class constroctor
        System.out.println("I am a child Constrocter ");

        //even if we don't have line 17 , the compiler will created it behind the scene


    }
       }