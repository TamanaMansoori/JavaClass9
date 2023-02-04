package Class17Constructors;

public class Students {
    /*
2)Write a java Class Students that have a constructor which takes students name and 3 subject grades.
Inside your class also have a method to Calculate Average Grade.
Test Student class for 5 different students with different marks.
Your program should print an average mark of each students name.
NOTE: please use different names for instance and local variables.
     */


    String name;
    String subject1;
    String subject2;
    String subject3;

    Students(String StudentName,String subjOne, String subjTwo, String subjThree){
        name=StudentName;
        subject1=subjOne;
        subject2=subjTwo;
        subject3=subjThree;
    }

    void printInfor(){
        System.out.println(name+" the grade for each sunject is: "+subject1+" "+subject2+" "+subject3+" ");
    }
}
