package Class12;

public class CarTester {
    public static void main(String[] args) {

        //create the object of the class
//new keyword create the object
        Car bmw=new Car();
        bmw.make="BMW";
        bmw.model="i7";
        bmw.year=2023;
        bmw.color="Grey";
        bmw.moveForward();//two lines of code will be executed from this
        bmw.applyBrakes();//one line of code will be executed from this

        System.out.println("++++++++++++++++++++++++++++++");

        Car audi=new Car();
        audi.make="Audi";
        audi.model="";
        audi.year=2020;
        audi.color="White";
        audi.moveForward();


    }
}
