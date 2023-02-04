package class6WhileLoop;

public class LogicalAndDemo {
    public static void main(String[] args) {

        boolean understandJava=true;
        boolean enjoyJava=true;

        if(understandJava && enjoyJava){
            System.out.println("You get the job quickly");
        }else {
            System.out.println("You need to work hard");
            /*
            now that both condition is true then we get the result as true and line 10 will be exicuted, if we change only one value of the value of variables to
            false then we get line 12 executed. and if we change both value of the value to false again we get line 12 executed.
             */
        }
    }
}
