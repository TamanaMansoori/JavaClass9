package class7;

public class Task1 {
    public static void main(String[] args) {

        /*
        using for loop print odd numbers from 1 to 20
         */
        for( int i=1; i<=20; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("--------------second way-----------------------");


      //  this way is faster

          for( int n=1; n<=30; n+=2) {
                System.out.println(n);
            }



    }
}
