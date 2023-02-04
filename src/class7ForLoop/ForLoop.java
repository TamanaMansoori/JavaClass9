package class7ForLoop;

public class ForLoop {
    public static void main(String[] args) {

        /*
        print number from 0 to 9
         */

        int number=0;//create a variable of type int
        while (number<10){//checks the condition if condition is true executes the code in the body of while loop
            System.out.println(number);//prints the value of number on console
            number++;// adds one to the number variable
        }

        System.out.println("------------same scenario using for loop------------");

        //here is steps for using for loop : initialization , condition, increment or decrement
        // int i=0;  this is intializing the variable
        //i<10; this is condition
        //i++ this is incrementing
        for(int i=0; i<10; i++){
            System.out.println(i);
        }


    }
}
