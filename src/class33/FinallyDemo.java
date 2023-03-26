package class33;

public class FinallyDemo {
    public static void main(String[] args) {


        System.out.println("1");

        try {
            System.out.println("2");//executed
         //   System.out.println(10/0);//this will raise the error or exception
            String name=null;
            System.out.println("3");//will skip this

        }catch (ArithmeticException ae){
            System.out.println("5");//executed
            System.out.println(10/0);//we need a nested catch block here so we get Arthimetic exception error
            System.out.println("4");//skip
        }
        finally {
            System.out.println("Will always be executed");//this line will be executed ecen if we have any other exception
        }

        System.out.println("6");//skip
    }
}
