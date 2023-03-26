package Class22Polymorphism;

public class ComputerTester {

    public static void main(String[] args) {

        Computer[]computers={new Apple(), new Dell(), new HP(), new Lenovo()};

        //computer is from the parent class

        for (Computer c:computers){
            c.Programme();
            c.TurnOn();

            //want to call the method only present in child class
            //here we have to do typCasting


            /*
            int a=(int)12.5;//this is typeCasting for int

             Computer[]computers={new Apple(), new Dell(), new HP(), new Lenovo()};
             for (Computer c:computers){//we are checking if the variavle (c) contains the object of an Apple class
            c.Programme();
            c.TurnOn();


            if(c instanceof Apple){
            Apple apple=(Apple)c;
            apple.           //after (.) we can specify the behaviors that is related to aplle class
            }
             */
        }

    }
}
