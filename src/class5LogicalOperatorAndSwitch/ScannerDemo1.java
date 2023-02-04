package class5LogicalOperatorAndSwitch;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter your age");
        int age=scan.nextInt();
        System.out.println("You are "+age+" Years old");

        System.out.println("Please enter your weight");
        double weight=scan.nextDouble();
        System.out.println("Your weight is "+weight);

        System.out.println("Are you hungry?");
        boolean hungry=scan.nextBoolean();
        System.out.println("Hungry "+hungry);

        System.out.println("Please enter your gender");
        char gender=scan.next().charAt(0);//this if for using char
        System.out.println("Your gender is "+gender);

        System.out.println("Please enter your name");
        String name=scan.next();//when we have to take only one word as input we use only next not nextline
        System.out.println("Your name is "+name);//here only Tamana will be executed.


        scan.nextInt(); //trick to make nextLine method work after we have used any other method from scanner class.
        System.out.println("Please enter your full name");
        String fullName=scan.nextLine();
        System.out.println("Your full name is "+fullName);





    }
}
