package homeWork;

import java.util.Scanner;

public class HomeWork7Class5 {
    public static void main(String[] args) {

        /*
        Ask user to enter their country and capture it. Once values are captured print which language user speaks.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your country name");
        String country=scan.next();

        if(country.equals("USA") && country.equals("UK")){
            System.out.println("Your national language is English");
        }else if(country.equals("Afghanistan")){
            System.out.println("Your national language is Dari and Pashto");
        }else {
            System.out.println("Not found");
        }
    }
}
