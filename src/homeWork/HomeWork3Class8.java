package homeWork;

import java.util.Scanner;

public class HomeWork3Class8 {
    public static void main(String[] args) {

 /*
 3) Write a program that reads a range of integers (start and end point)
 provided by a user and then from that range prints the sum of the even and odd integers.
  */

       /* int evenSum=0;
        int oddSum=0;
     Scanner scan=new Scanner(System.in);
       System.out.println("Please enter a range of numbers");
        int num=scan.nextInt();

        for (int i = 10; i <=20; i++) {
            if (i % 2 == 0) {
                evenSum = evenSum + i;

            } else {
                oddSum = oddSum + i;
            }
        }
            System.out.println("The sum of "+num+" = "+evenSum);
            System.out.println("The sum of "+num+" = "+oddSum);*/


        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter two numbers, starting point and ending point");
        int start=scan.nextInt();
        int end=scan.nextInt();

        int evenSum=0;
        int oddSum=0;

        for (int i = start; i <=end; i++) {
         //   System.out.println(i);
            if(i%2==0){
               // System.out.println("even number "+i);
                evenSum+=i; // can also write evenSum+=i
            }else{
               // System.out.println("odd number "+i);
                oddSum=oddSum+i;//can aslo write oddSum+=i
            }
        }
        System.out.println("Sum of all the even numbers "+evenSum);
        System.out.println("Sum of all the odd numbers "+oddSum);

        }


    }

