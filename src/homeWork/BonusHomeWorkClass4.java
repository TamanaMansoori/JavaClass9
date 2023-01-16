package homeWork;

import java.util.Scanner;

public class BonusHomeWorkClass4 {
    public static void main(String[] args) {
        /*
         Write a program to ask user to enter numbers of worked years and annual salary.
         If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not.
         Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("How many years you have worked for us?");
        int year=input.nextInt();
        System.out.println("How much is your salary?");
       int salary=input.nextInt();

        if(year>5){
            System.out.println("You are eligible for bonus");
            if(salary>50000){
                System.out.println("You will get 5000 bonus");
            }else{
                System.out.println("You will get 3000 bonus");
            }
        }else{
            System.out.println("You are not eligible for bonus");
        }


    }
}
