package Class19Inheritance;

public class Sport {
    //instance variable
    String name;
    String country;


    //constructor
    Sport(String name, String country){
        this.name=name;
        this.country=country;
    }

    //method
    public void display(){
        System.out.println(name+" is played in "+country);
    }
}
//we make child class of sport
class Cricket extends Sport{
     String helmet;

     //here we create the constroctor of child class(Cricket)
     Cricket(String name, String country, String helmet){
         super(name, country);//here we call the parameterized constractor created in line 10 from Sport
         this.helmet=helmet;//here we intiazlize the Cricket class


         //super call the parent class or immediate parent class
         //this. call the current class(child class)
     }


    //here we do the test for cricket class
    public static void main(String[] args) {

        Cricket cricket =new Cricket("Cricket", "Pakistan", "Green helmet");//here we put these values bcoz it is a parametrized constructor
      cricket.display();


      //here we do the test for soccer class
        Soccer soc=new Soccer("Soccer","Argentina","Oliver's", 12);
        soc.display();
        soc.displayTeam();
     }
}

