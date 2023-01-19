package homeWork;

public class HomeWork6Class8 {
    public static void main(String[] args) {
   /*
   6) Print the following pattern:
*
* *
* * *
* * * *
* * *
* *
*
    */


        for (int i = 0; i <=4 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

        for (int i = 1; i <=4 ; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }



    }
}
