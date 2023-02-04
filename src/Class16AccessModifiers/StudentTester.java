package Class16AccessModifiers;

public class StudentTester {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="Zafar";
        student.id="123";
        student.schoolName="Syntax";
        student.age=22;
        student.weight=70;

        Student student1=new Student();
        student1.name="Hamid";
        student1.id="456";
        student1.schoolName="Syntax";
        student1.age=32;
        student1.weight=60;


        Student student2=new Student();
        //student2.name="Nelson";
        student2.id="789";
        student2.schoolName="Syntax";
        student2.age=38;
        student2.weight=90;

        //school name is same for all students
        //when we create instance variable for each object there will be one seperate copy
        //of all variable avaliable
        System.out.println(student2.schoolName);//we get the value bcoz same value for all
        System.out.println(student2.name);//null, bcoz name is instance variable
        System.out.println(Student.schoolName);//another way that you might see a lot to access static variabel
        //here we can access to variable even by calling the name of class
    }
}
