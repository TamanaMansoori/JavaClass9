package class5;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        //it is same as ifElseIf conditions.
        //this method is way faster than using if else if condition but it has lots of limitaions
        //we can't use boolean with switch cases
        //also it is not working with all data types .
        //if we don't put break in between with switch it executes all conditions(code) until it reaches to the break .
        //why learning it ?? because they are very fast .
        /*

         */

        int day=1;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("wrong day");




        }
            }
}
