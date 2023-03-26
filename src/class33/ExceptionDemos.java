package class33;

public class ExceptionDemos {
    public static void main(String[] args) {

        System.out.println("Line1");
        System.out.println("Line2");
        System.out.println("Line23");
        System.out.println("Line11");
        System.out.println("Line14");
        try{

            System.out.println(10/0);
           /* String name=null;
            System.out.println(name.length());*/
        }catch (NullPointerException npe){//
            System.out.println(npe);
        }catch (ArithmeticException e){
            System.out.println("Some one is trying to divide 10 by 0");
        }

        System.out.println("Line9");
        System.out.println("Line10");

    }
}
