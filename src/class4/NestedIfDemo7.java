package class4;

public class NestedIfDemo7 {
    public static void main(String[] args) {

     boolean studyHard=true;
     int salary=7000;

     if(studyHard){
         System.out.println("You will get the job");
         if(salary>100000){
             System.out.println("I will buy Tesla");
         }else{
             System.out.println("I will buy a Toyota");
         }
     }else {
         System.out.println("It might take a little longer for you to get the job");
     }




    }
}
