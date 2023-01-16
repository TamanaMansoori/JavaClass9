package homeWork;

import java.util.Scanner;

public class HomeWork4Class8 {
    public static void main(String[] args) {
        /*
        1) Write a program to ask a user to enter item they want to buy and the price of that item. User will
       be entering 5 items. Every time user enters price accumulate the price and tell the user how much
        totalPrice that they should pay.
        If user give more money program should return a change. Whenever a user done with payments program
        should say "Thank you for shopping!"


         Step 1= ask user for item price and item name
         step 2= accumulate the price
         step 3= tell the user how much total they should pay or actual money
         step 4= if user give more money , you should return a change
         */

        double total=0;
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i < 3; i++) {

            System.out.println("Please enter the items you want to buy and its price");
            String item=scan.next();
            double itemPrice= scan.nextDouble();
            total=total+itemPrice;
            System.out.println("This is the total amount that you have to pay "+total);
        }
        System.out.println("Please pay for the items");
        double amountPaid=scan.nextDouble();

        if(amountPaid>total){
            double change=amountPaid-total;
            System.out.println("here is you change "+change);
        }else if(amountPaid<total){//if customer pays less then this is the line
            System.out.println("You can't buy all the items");
        }
        System.out.println("Thank you for your shopping");



    }
}
