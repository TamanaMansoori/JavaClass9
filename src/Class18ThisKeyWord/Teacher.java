package Class18ThisKeyWord;

public class Teacher {
    //we can have variables and method inside the class

    //here we create variable
    String name;
    int teacherId;
    String subject;


    //here we create constructor with parameter name and ID
    Teacher(String name, int teacherId){
        this.name=name;
        this.teacherId=teacherId;
    }

    //here we intialize all 3 variabls
    Teacher(String name, int teacherId, String subject){
        //this.name=name;//we already called this line on line 14
        //this.teacherId=teacherId;
        //so instead we use below cond
        this(name, teacherId);
        this.subject=subject;
    }

}
