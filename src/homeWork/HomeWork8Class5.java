package homeWork;

import java.util.Scanner;

public class HomeWork8Class5 {
    public static void main(String[] args) {
        /*
        8)HomeWork: Using scanner class create calculator.
        Allow user to enter 2 numbers and operator(+,-,*,/). Based on operator provide the result to user.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=scan.nextInt();
        System.out.println("Please enter second number");
        int num2=scan.nextInt();
        System.out.println("Please enter operator +,-,*,/");
        char operator=scan.next().charAt(0);

        switch (operator){
            case'+':
                System.out.println(num1+num2);
                break;
            case'-':
                System.out.println(num1-num2);
                break;
            case'*':
                System.out.println(num1*num2);
                break;
            case'/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid");

        }




    }
}
