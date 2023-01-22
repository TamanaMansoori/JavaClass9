package Class11;

public class CatTester {
    public static void main(String[] args) {

        Cat cat1=new Cat();// cat1 is the variable name and we can use any name
       //below we can also have access to the attributes of the object from class Cat and assign value to each

       cat1.name="Lego";
       cat1.breed="Van Cat";
       cat1.age=2;
       cat1.attitude=false;
       cat1.eat();//it is how we create the behaviour of the cat and it is also the output

//below code is  the behaviors for cat2
       Cat cat2=new Cat();
        cat2.name="MEMO";
        cat2.breed="Domestic";
        cat2.age=6;
        cat2.attitude=false;

        System.out.println(cat2.breed);  //output
        cat2.speak();// output


    }
}
