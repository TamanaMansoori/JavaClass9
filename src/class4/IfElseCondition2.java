package class4;

public class IfElseCondition2 {
    public static void main(String[] args) {

        boolean rain=true;
        if(rain){
            System.out.println("Let's take the umbrella");//if the value of rain is true or the condition is true then we get is line executed.
        }else{
            System.out.println("Don't take the umbrella");//if the value of rain is changed to false then we get these two line
            System.out.println("Let's go for walk");
        }

        //Create a boolean variable call it break if it condition is true print let's take break otherwise let's continue the class.

        boolean breakTime=true;
        if(breakTime){
            System.out.println("Let's take the break");
        }else{
            System.out.println("Let's continue the class");
        }


    }
}
