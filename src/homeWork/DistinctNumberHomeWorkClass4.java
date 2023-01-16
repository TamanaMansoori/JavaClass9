package homeWork;

import java.util.Scanner;

public class DistinctNumberHomeWorkClass4 {
    public static void main(String[] args) {
        /*
        write a programm to find the largest number among three distinct numbers using nested if condition
        plese use scanner
         */



        Scanner scanner=new Scanner (System.in);
        System.out.println("Please enter 3 numbers ");

        int number1=10;
        int number2=20;
        int number3=30;

        number1=scanner.nextInt();
        number2=scanner.nextInt();
        number3=scanner.nextInt();


         if(number1>number2){
             if(number1>number3){
                 System.out.println("number 1 is the largest "+number1);
             }
         }

         if (number2>number1){
             if(number2>number3){
                 System.out.println("number 2 is largest "+number2);
             }
         }
    }
}
