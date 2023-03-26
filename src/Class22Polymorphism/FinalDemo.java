package Class22Polymorphism;

public class FinalDemo {

    public static void main(String[] args) {
         final int num=10;
      //   num=20; here we get error becoz it is final


        final int num2; // but if we don't assign any value to it and just declared then we can put value to it.
        num2=8;

    }

    //here we use final keyword with (method) and by doing it no one can override this method
    final void noOneShouldOverrideIT(){
        System.out.println("This method should never be overridden otherwise it might break the code base");
    }
}


class Input extends FinalDemo{
   /*     void noOneShouldOverrideIT(){
        System.out.println("This method should never be overridden otherwise it might break the code base");
        }
        }*/


//here we use final keyword with class

/* class final testing{

 }  */
        }