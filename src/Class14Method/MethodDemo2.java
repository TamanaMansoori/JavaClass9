package Class14Method;

public class MethodDemo2 {

    void printHello(){
        System.out.println("Hello world");//define the method
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");

    }

    //below method is better because we can cotrol the number of execution as per our choice
    void printHelloManyTimes(int  times){

        for (int i = 0; i < times; i++) {
            System.out.println("Hello World");

        }
    }

    //control what we print in the console

    void printManyTimes(int times,String word){//it will ask for int and String value and we have to pass both dataType value

        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }




}
