package class5LogicalOperatorAndSwitch;

import java.util.Scanner;

public class SwitchCaseDemo5 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your gender F/M");

        char gender=scanner.next().charAt(0);

        // char gender='F';
         switch (gender){
             case'f':
             case 'F':
                 System.out.println("Female");
                 break;
             case'm':
             case 'M':
                 System.out.println("Male");
                 break;
             default:
                 System.out.println("not specified");
         }
    }
}
