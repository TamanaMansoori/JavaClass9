package homeWork;

import java.util.Scanner;

public class TemperatureHomeWorkClass4 {
    public static void main(String[] args) {
        /*
        Create a Java program that will ask user to input city and temperature.
        Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ”
         */

        double celsius;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the city");
        String city=input.nextLine();
        System.out.println("Please enter the temperature in Fahrenheit:");
        double fahrenheit=input.nextDouble();
        celsius=(fahrenheit-32)*5/9;

        System.out.println("The temperature in "+city+" is "+celsius+" C");




    }
}
