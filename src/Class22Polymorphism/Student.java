package Class22Polymorphism;

public class Student {
    /*
Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
     */

    //below we difine common behaviours in the parent class
    void HomeWork(){
        System.out.println("Students are supposed to done the Home Work everyday");
    }

    void Attandence(){
        System.out.println("Students have to be present in the class ");
    }
}

//here we create the subClass and override some behaviors from parent class and create one which is only for this child class line 23
class SyntaxStudent extends Student{
    void Quizze(){
        System.out.println("Students have to done the quizzes every week");
    }
    @Override
    void HomeWork() {
        System.out.println("Syntax Student should done the HomeWork everyday ");
    }

    @Override
    void Attandence() {
        System.out.println("Syntax Students should have good attendence to get all lessons ");
    }
}

//here we create a subClass
class CollegeStudent extends Student{
    void Assignments(){
        System.out.println("College Students will get extra assignments each semester ");
    }

    @Override
    void HomeWork() {
        System.out.println("College students must do the home work to get good mark");
    }

    @Override
    void Attandence() {
        System.out.println("Good attendence is mush for college students");
    }
}


//here we create a subClass and here we don't override any behavior
class SchoolStudent extends Student{

    void groupProject(){
        System.out.println("Students will be assigned to work on group projects ");
    }


}