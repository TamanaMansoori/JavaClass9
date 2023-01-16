package homeWork;

import java.util.Scanner;

public class homeWork4Class5 {
    public static void main(String[] args) {
        /*
        4)Write a program for user to enter his/hers birth month. Based on the month define the season.
Example: if user is born in June, July or August → season =”Summer”.
At the end of the program we should see output as “You were born __”.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month=scan.next();
        if(month.equals("January") || month.equals("February") || month.equals("March")){
            System.out.println("You were born on Winter");

        } if (month.equals("April")||month.equals("May") || month.equals("June")){
            System.out.println("You were born on Spring");
        } if (month.equals("July")||month.equals("August ") || month.equals("September")){
            System.out.println("You were born on Summer");
        }if(month.equals("October")||month.equals("November") || month.equals("December")){
            System.out.println("You were born on fall");
        }

    }
}
