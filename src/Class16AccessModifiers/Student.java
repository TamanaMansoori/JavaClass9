package Class16AccessModifiers;

public class Student {
    // this is student class
    String name;
    String id;
    static String schoolName;
    int age;
    double weight;

    void printName(){
        int SSN=123456678;
        System.out.println(name);
        System.out.println(schoolName);
    }
    static void printStudentInfo(){
       // System.out.println(name); // can't access here
       //System.out.println(schoolName);
    }
}
