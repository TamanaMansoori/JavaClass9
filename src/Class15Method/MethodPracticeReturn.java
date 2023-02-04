package Class15Method;

public class MethodPracticeReturn {
    public static void main(String[] args) {


        MethodPractice method=new MethodPractice();
     boolean isEven=   method.isEven(15);
        System.out.println(isEven);

        //call isEven method for the numbers 100, 12 20

      //  MethodPractice method1=new MethodPractice();
        boolean isEven1=method.isEven(100);
        System.out.println(isEven1);


       // MethodPractice method2=new MethodPractice();
        boolean isEven2=method.isEven(12);
        System.out.println(isEven2);


      //  MethodPractice method3=new MethodPractice();
        boolean isEven3=method.isEven(20);
        System.out.println(isEven3);


    }
}
