package Class17Constructors;

public class StudentTester {
    public static void main(String[] args) {

  ///here we create the object of class with the help of constractor
        Student Tamana=new Student("Tamana","2345",25,60.3);
        Tamana.printInfo();
        Student Hamid=new Student("Hamid","7890",29,70.0);
        Hamid.printInfo();
        Student Zafar=new Student("Zafar","4782",30,80.1);
        Zafar.printInfo();



        Student student2=new Student(32,"Zam","2222");
        student2.printInfo2();


        //here we create same object of class but withoud constractor
       /*
        Student student1=new Student();
        student1.name="Zafar";
        student1.id="4782";
        student1.age=26;
        student1.weight=50.5;*/
    }
}
