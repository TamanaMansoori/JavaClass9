package Class17Constructors;

public class Dog {
    String name;

    String breed;
    int age;
    double weight;

    Dog(String dogName,String dogBreed, int dogAge,double dogWeight){
        name=dogName;
        breed=dogBreed;
        age=dogAge;
        weight=dogWeight;

    /*}

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.name="Shepherd";
        dog.breed="German";
        dog.age=2;
        dog.weight=3.4;

        Dog dog1=new Dog();
        dog.name="jami";
        dog.age=10;
        dog.breed="shepherd";
        dog.weight=90.5;

        Dog dog2=new Dog();
        dog.name="kangal";
        dog.age=8;
        dog.breed="shepherd";
        dog.weight=151.5;

        Dog dog3=new Dog();
        dog.name="alabi";
        dog.age=5;
        dog.breed="shepherd";
        dog.weight=100.5;
*/

    }

    void printInfo(){
        System.out.println("Name "+name+" Breed "+breed+" age "+age+" Weight "+weight);
    }
}
