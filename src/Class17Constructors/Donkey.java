package Class17Constructors;

public class Donkey {

    String name;
    int age;

/*    Donkey(){
        System.out.println("This is non argument constructor");
        here we created the non argument constructor
    }*/


    //below in line 16 we create the parameterized constroter

    Donkey(String donName, int donAge){

        name=donName;
        age=donAge;

    }


    void print(){
        System.out.println("Donkey's name is "+name+" age is "+age);
    }


    public static void main(String[] args) {

        //here we call the constructor
      //  new Donkey();//this is a defult constructor and it is created by the complier when a programmer does not create one .
        //defult is none argumental constructor


//call the constructor
        //Donkey donkey=new Donkey();//once we create the parameterized constrocter in line 16, then the defult constructor should be removerd


       Donkey donkey= new Donkey("Pepper",3);//the moment we create a constructor compliler dose not give any defult constructor

//call the method
        donkey.print();//we get the defult because we didn't put any value to name and age

    }

    }
