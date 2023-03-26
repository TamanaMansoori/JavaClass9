package class32ExceptionHandler;

public class ExceptionDemo1 {
    public static void main(String[] args) {

        //if you think the code you are witing will give you error during run time, we use ExceptionHandling using Try Catch method
        //here we get error during runTime but by try catch the execution of code from line 19 and 20 will not be stoped once it is runned
        System.out.println("Line1");
        System.out.println("Line2");
        System.out.println("Line23");
        System.out.println("Line11");
        System.out.println("Line14");
        try{
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Line9");
        System.out.println("Line10");


    }
}
