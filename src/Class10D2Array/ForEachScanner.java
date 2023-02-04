package Class10D2Array;

import java.util.Arrays;
import java.util.Scanner;

public class ForEachScanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int[] numbers=new int[5];//empty array of 5 elements
     //   numbers[0]=40;//manually assigne some numbers
    //    numbers[1]=50;
     //   numbers[2]=60;//manually assigne some numbers
     //   numbers[3]=70;
     //   numbers[4]=80;
    //this method is requiring lots of code, instead we can use array
//        numbers[0]=scanner.nextInt();
//        numbers[1]=scanner.nextInt();
//        numbers[2]=scanner.nextInt();
//        numbers[3]=scanner.nextInt();
//        numbers[4]=scanner.nextInt();

        //below code is for loop to ask user for numbers and store them in the array

        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=scanner.nextInt();
        }
       System.out.println(Arrays.toString(numbers));//here we print all numbers


    }
}
