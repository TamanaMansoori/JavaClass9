package homeWork;

import java.util.Scanner;

public class HomeWork3Class5 {
    public static void main(String[] args) {
        /*
        3) Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following
         rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your quiz score");
        int quiz=scan.nextInt();
        System.out.println("Please enter your mid term score");
        int midTerm=scan.nextInt();
        System.out.println("Please enter your final score");
        int finalScore=scan.nextInt();

        int average=60;

        if (average>=90){
            System.out.println("Your grade is A");

        }if (average>=70 && average<90){
            System.out.println("Your grade is B");
        }if (average>=50 && average<70){
            System.out.println("Your grade is C");
        } if (average<=50){
            System.out.println("Your grade is F");

        }


    }
}
