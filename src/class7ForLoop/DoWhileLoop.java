package class7ForLoop;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int number=5;
        do {
            System.out.println("Please enter a number");
            number = scan.nextInt();
        }while(number!=5);

        System.out.println("--------------------while loop---------------");

        int number2=5;

        while (number2!=5){
            System.out.println("Please enter a number : ");
            number2=scan.nextInt();

        }


    }
}
