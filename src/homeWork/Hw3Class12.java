package homeWork;

import java.util.Scanner;

public class Hw3Class12 {
    public static void main(String[] args) {
        /*
3) Write a program that reads two people's first
names and if they expecting boy or girl?
Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY

Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL

         */

        String mom = "Mary";
        String dad = "Daniel";
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your names");
        String name1 = scan.next();
        String name2 = scan.next();
        System.out.println("Boy or Girl");
        String gender = scan.next();
        String babyName;

        if (gender.equals("Boy")) ;
        {
            babyName = dad.substring(0, dad.length()/2);
            //babyName=dad.substring(0,dadsName.length()/2);//it shows the letters from start till middle (first half)
            if (gender.equals("Girl")) {
                babyName = mom.substring(mom.length()/2);
             ///   mom.sustring(mom.length()/2);  here /2 prints the half of any name we write , and it is the last half name

            }
                System.out.println("baby name is " + babyName);
            }


        }

    }