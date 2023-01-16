package homeWork;

import java.util.Scanner;

public class HomeWorkClass5 {
    public static void main(String[] args) {
        /*
        Prompt the user to enter person heights in inches. Person should be classified as one of the following:
â€¢ short (under 60 inch)
â€¢ medium(between 60 -72 inch)
â€¢ tall (over 72 inch)
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your height");

        int height=scan.nextInt();

        if(height<=60){
            System.out.println("Your height is considered as short ");
        }if(height>60 && height<70){
            System.out.println("Your height is considered as medium");
        }else if(height>=70){
            System.out.println("You are tall");
        }

    }
}
