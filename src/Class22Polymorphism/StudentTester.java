package Class22Polymorphism;

public class StudentTester {

    public static void main(String[] args) {

        //here we create the test class or polymorphism

        Student [] students={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};

        for (Student student:students){
            student.Attandence();
            student.HomeWork();
            //here we call the behavior from parent class inculding the all those methods which are overridden in child classes
            //since we have override only (Attandence and Home Work) in all subClass so we only get these two behavior and
            //it be executed for all the child class in which we override the behaviour.

        }
    }
}
