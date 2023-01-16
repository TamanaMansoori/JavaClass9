package class2;

public class Task4 {
    public static void main(String[] args) {
        /*
        4) Write a Java program to add, subtract, multiply and divide 2 decimal values. Your program should say. “The __ of 2 numbers __ and  is equal to __”
Expected Output:
The Addition of 2 numbers 10.5 and 10.5 is equal to 21.0
The Subtraction of 2 numbers 10.5 and 10.5 is equal to 0.0
The Multiplication of 2 numbers 10.5 and 10.5 is equal to 110.25
The Division of 2 numbers 10.5 and 10.5 is equal to 1.0
b) Write a program to find the square of the number 3.9. You program should say “The square of the  is  “
Expected output:
The square of the 3.9 is 15.209999999999999
         */

        float number1= 5.5F;
        float number2= 15.5F;
        float number3= 2.25F;
        float addition=number1+number2;
        float subtraction=number1-number2;
        float multiplication=number1*number2;
        float division=number1/number2;
        System.out.println("The Addition of 2 numbers "+number1+" and "+number2+" is equal to "+ addition);
        System.out.println("The Subtraction of 2 numbers "+number1+" and "+number2+" is equal to "+ subtraction);
        System.out.println("The multiplication of 2 numbers "+number1+" and "+number2+" is equal to "+ multiplication);
        System.out.println("The Division of 2 numbers "+number1+" and "+number2+" is equal to "+ division);

        System.out.println("The square of the "+number3+" is "+(number3*number3));





    }
}
