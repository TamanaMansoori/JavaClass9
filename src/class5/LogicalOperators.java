package class5;

public class LogicalOperators {
    public static void main(String[] args) {

        //logical operators: helps combine multiple boolean values. there is 3 logival type:
       //   !   ||  &&
        //it is only working with boolean
        // NOT Operator (!) is used to negate the boolean values if something is true it will make it false
        //if something is false it will make it true.
       //whe apply to true it changes to false and when apply to false it changes to true
        /*



         */



        System.out.println(!true);
        System.out.println(!false);

        boolean rich=true;
        System.out.println(!rich);//false

        int num=9;

        if(num==9){
            System.out.println("Hello world");
        }else{
            System.out.println("hello java");
        }


        String country="China";
        if(!country.equals("BadCountry")){
            System.out.println("You are welcome");
        }

        if(country.equals("China")){
            System.out.println("You are welcome");
        }

        if(country.equals("Nepal")){
            System.out.println("You are welcome");
        }

        if(country.equals("Pakistan")) {
            System.out.println("You are welcome");
        }
    }
}
