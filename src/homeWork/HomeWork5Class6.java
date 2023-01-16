package homeWork;

public class HomeWork5Class6 {
    public static void main(String[] args) {
        /*
        Print even numbers from 20 to 1 (2 ways)
         */

        int num=20;
        while(num>=1) {
            if (num%2==0) {
                System.out.println(num);
            }
            num--;
        }

        System.out.println("----------------------------------TASK 6---------------------------------------------------");

        /*
        Print odd numbers between 20 and 50 (2 ways)
         */
        int number=20;
        while(number<=50){
            if(number%2!=0){
                System.out.println(number);
            }
            number++;
        }
    }
}
