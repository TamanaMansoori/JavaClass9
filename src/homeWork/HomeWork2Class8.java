package homeWork;

import java.util.Scanner;

public class HomeWork2Class8 {
    public static void main(String[] args) {
        /*
    2) Create a program that will be asking user to apply for a credit card 10 times.
     As soon you get an “yes” from a user program should stop asking.
     */

        boolean input;
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you have credit card?");

        input = scan.nextBoolean();
        for (int i = 0; i < 10; i++) {
            if (i == 10) {
                break;
            }System.out.println("Please apply for credit card");

            }
                System.out.println();

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

      Scanner scanner =new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Do you want a credit card");
            String userResponse= scan.next();
            if(userResponse.equalsIgnoreCase("yes")){
                break;
            }

        }






            }

        }



