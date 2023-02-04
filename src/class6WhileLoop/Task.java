package class6WhileLoop;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter the day");
        String day=scan.next();

        if(day.equalsIgnoreCase("monday")){
            System.out.println("we don't have class today");
        }else if(day.equalsIgnoreCase("Sunday")||day.equalsIgnoreCase("saturday")){
            System.out.println("we have Java class");
        }else{
            System.out.println("You have entered wrong day");
        }
    }
}
