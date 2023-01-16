package class5;

public class LogicalOperator3 {
    public static void main(String[] args) {

        /*
        OR (||) :
        here if only one condition is true the result is true
         */

        if(10>5 || 4>6){
            System.out.println("1");
        }else{
            System.out.println("2");
        }

        String name="Adem";
        int age=30;

        if(name.equals("Adem")&& age==30){// here both conditions is true so line 20 will be executed
            System.out.println("You are the Adem from batch 13");
        }else{
            System.out.println("I don't know you");
        }

        boolean isTrue=false;
        if(!isTrue){//it changes the value to true and that is why we get the line 27 executed
            System.out.println("You got it");
        }else{
            System.out.println("Need more practice");
        }

    }
}
