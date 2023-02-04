package Class16AccessModifiers;

public class StudentTask {
    /*
    Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
     */

    String name;
    String ID;
  static int numberOfStudents;


    public static void main(String[] args) {
        StudentTask studentTask2=new StudentTask();
        studentTask2.name="Tamana";
        studentTask2.ID="234";
       studentTask2.numberOfStudents=50;


        StudentTask studentTask1=new StudentTask();
        studentTask1.name="Zafa";
        studentTask1.ID="789";
        studentTask1.numberOfStudents=50;

        //System.out.println(studentTask);
        System.out.println(StudentTask.numberOfStudents);

    }
}