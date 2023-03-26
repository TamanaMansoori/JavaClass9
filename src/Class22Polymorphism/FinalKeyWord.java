package Class22Polymorphism;

public class FinalKeyWord {

    // 3 main useage
    //1- with Variable
    //2-with method

    //when we don't want someone to change the value of that varible then we use final keyword

    final double gravity=9.8; // it is constant(something that never changes)
   final double PI=3.14;
   final double LightSpeed=299792458;

   //below is method and here we want to change the value of the variable so we get error
   final void tryChangingGravity(){
      //  gravity=1.6;  //here we get error bcoz the variable is final and the value will not be changed

    }
}
//here we want to create class and extend it from parent class that has (Final) key
class Child extends FinalKeyWord{
    /*viod tryChangingGravity(){  we get error bcoz the method had final keyword

    }*/
}