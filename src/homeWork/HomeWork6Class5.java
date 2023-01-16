package homeWork;

public class HomeWork6Class5 {
    public static void main(String[] args) {
        /*
        6)Write a program to find largest number among three numbers using nested if provided by a user (numbers must be distinct)
         */

        int num1=40;
        int num2=30;
        int num3=20;

        if(num1>num2){
            if(num1>num3){
                System.out.println(num1+" is the largest among the all numbers");
            }else if(num2>num3){
                System.out.println(num2+" is the larger number among these two");
            }
        }else{
            System.out.println("number is wrong");
        }


    }
}
