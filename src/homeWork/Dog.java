package homeWork;

public class Dog {


    String dogName;
    double dogWeight;
    String dogBreed;


    Dog(String Name, String Breed, double Weight){

        dogName=Name;
        dogWeight=Weight;
        dogBreed=Breed;
    }

    void printInfo(){
        System.out.println(dogName+" "+dogBreed+" "+dogWeight);
    }


    public static void main(String[] args) {

        Dog tarzan=new Dog("Tarzan","Mutt",50.0);
        tarzan.printInfo();

        Dog lucy=new Dog("Lucy","Mutt",10.0);
        lucy.printInfo();

    }
}





