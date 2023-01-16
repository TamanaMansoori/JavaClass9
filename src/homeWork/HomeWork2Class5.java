package homeWork;

import java.util.Scanner;

public class HomeWork2Class5 {
    public static void main(String[] args) {
        /*

2) Write a program that will print whether it is a weekend or weekday.
If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a weekend”
any other day → output “Invalid day”
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("What day is today?");
        int day=scan.nextInt();

        if(day>0 && day<5){
            System.out.println("It is a weekday");
        }else {
            System.out.println("It is a weekend");
        }






    }
}
