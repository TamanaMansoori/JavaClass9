package homeWork;

import java.util.Scanner;

public class HomeWorkLoanClass4 {
    public static void main(String[] args) {
        /*
        You are a loan specialist, and you need to ask user what is the amount of loan is needed.
        If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
         */

        Scanner input=new Scanner(System.in);
        System.out.println("What is the amount of loan is needed");
        int amount=input.nextInt();

        if(amount<=200000){
            System.out.println("I would lend the money");
        }else{
            System.out.println("You are not eligible for loan");
        }
    }
}
