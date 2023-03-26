package Class23Abstruction;

import Class11.Cat;

public class AnimalTester {

    public static void main(String[] args) {
        // Animal animal=new Animal();//we can't create the object of class bcoz the main class is abstracted
       //  animal.speak();
        // }

        //we get error here bcoz the class is abstract



        //we can to polymosohism or make Array or loop

        Animal[] arr={new Dog(),new Cut()};
        for(Animal animal:arr){
            animal.speak();


        }
    }
}
