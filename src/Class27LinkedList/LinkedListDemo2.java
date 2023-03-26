package Class27LinkedList;

import java.util.LinkedList;

public class LinkedListDemo2 {

    public static void main(String[] args) {

        LinkedList<String> subjects=new LinkedList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Jira");
        subjects.add("Git");
        subjects.add("Java");


        LinkedList<String> futureSubjects=new LinkedList<>();
        futureSubjects.add("Selenium");
        futureSubjects.add("TestNg");
        futureSubjects.add("Cucumber");
        futureSubjects.add("SQL");
        futureSubjects.add("APIs");
        futureSubjects.add("Jenkins");


        //we want to combiane the above two lists

        LinkedList<String> allSubjects=new LinkedList<>();
        //get all the elements/subjects from subject list and futureSubject and put them in allSubject list

        allSubjects.addAll(futureSubjects);
        allSubjects.addAll(subjects);

        System.out.println(allSubjects);

       //here we want to remover some elements
        LinkedList<String> subjectsILike=new LinkedList<>();
        subjectsILike.add("Java");
        subjectsILike.add("SDLC");
        subjectsILike.add("SQL");

        System.out.println(subjectsILike);

        allSubjects.removeAll(subjectsILike);

        System.out.println(allSubjects);
    }


}
