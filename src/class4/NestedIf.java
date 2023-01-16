package class4;

public class NestedIf {
    public static void main(String[] args) {

        /*
        in Nested If even if the one condition is false nothing will be executed
         */

        int money=1000;
        String day="Sunday";
        boolean mood=true;

        if(money>700){
            if(mood){
                System.out.println("I will go for shopping");
            }
        }
    }
}
