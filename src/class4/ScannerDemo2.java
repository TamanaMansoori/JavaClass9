package class4;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in); //this line should be memorized
        System.out.println("Please enter your age");
        int age=input.nextInt();//this part after = should be memorized
        System.out.println("You are "+age+" years old");


    }
}
