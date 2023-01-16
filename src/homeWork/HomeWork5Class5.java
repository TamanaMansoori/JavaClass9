package homeWork;

public class HomeWork5Class5 {
    public static void main(String[] args) {
        /*
        5) Write a program to find largest of three double values using if-else..if
        and logical operators provided by a user (numbers must be distinct)
         */

        double num1=95.90;
        double num2=78.90;
        double num3=55.90;

        if (num1>num2 && num1>num3 && num1>num2){
            System.out.println(num1+" is the largest number");

        }else{
            System.out.println(num1+" is not largest number");
        }

        System.out.println("------------------second approch using Scanner ------------------------------------");

       /*
        Scanner scanner=new Scanner(System.in);
        int number1,number2,number3;
        System.out.println("Please Enter three Numbers");
        number1=scanner.nextInt();
        number2=scanner.nextInt();
        number3=scanner.nextInt();

        if(number1>number2&& number1>number3){
            System.out.println("The Largest Number is "+ number1);
        } else if (number2>number3&& number2>number1) {
            System.out.println("The Largest Number is "+ number2);
        } else if (number3>number2&&number3>number1) {
            System.out.println("Largest number is "+ number3);
        }
        */


    }
}
