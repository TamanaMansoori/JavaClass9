package Class18ThisKeyWord;

public class TeacherClass {

    String teacherName;
    String Id;
    String subject;

    void teaches(){
        System.out.println("She makes sure to teach the topic as clear as possible");
    }

    void homeWork(){
        System.out.println("he gives us more than 6 task each day to practice");
    }

    void onTime(){
        System.out.println("he starts the class on time and ends on time");
    }

    void extraClass(){
        System.out.println("If the topics are not clear, she sets extra sessions for students");
    }

}

class MathTeacher extends TeacherClass{
    String name;

    void makeJokes(){
        System.out.println("Math teacher makes jokes during the sessions, so that students don't get bored");
    }

}

class ChemistTeacher extends TeacherClass{
    boolean lab;
    void experiment(){
        System.out.println("All topic being experimented into lab");
    }
}

class PianoTeacher extends TeacherClass{
    int practiceHour;

    void practice(){
        System.out.println("Teacher encourages students to practice Piano at least 5 hours a day");
    }

    public static void main(String[] args) {

        TeacherClass teacher=new TeacherClass();
        teacher.teacherName="Asel";
        teacher.homeWork();
        teacher.Id="2345";
        teacher.subject="Java";


        ChemistTeacher chemist=new ChemistTeacher();
        chemist.teacherName="Fizzy";
        chemist.experiment();
        chemist.lab=true;


        MathTeacher math=new MathTeacher();
        math.teacherName="Asghar";
        math.subject="Math";
        math.makeJokes();





    }
}
