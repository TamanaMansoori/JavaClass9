package Class17Constructors;

public class Student {
    /*
    create a class and call it student define 4 instance field liken name, age, weight, id
    create 5 object of this class do this task without constructors and with constructors

     */

//here we creat class
    String name;
    String id;
    int age;
    double weight;

    //here we create the constructor
    Student(String studentName, String studentId, int studentAge, double studentWeight) {
        name = studentName;
        id = studentId;
        age = studentAge;
        weight = studentWeight;
    }
        //below we make anothor constructor with same parameters but the number of parameters are only has 3 value. if there is same constractor with same
        //number of parameters(value) then we get error

        Student(int studentAge, String studentName, String studentId){
            name = studentName;
            id = studentId;
            age = studentAge;

    }

    //here we create method
    void printInfo2(){
        System.out.println(id+" "+name+" "+weight);
    }


    //here we create method
    void printInfo(){

        System.out.println("Name "+name+" ID "+id+" age "+age+" Weight "+weight);
    }
}
