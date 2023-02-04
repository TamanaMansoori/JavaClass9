package class8NestedLoop;

public class NestedLoops {
    public static void main(String[] args) {

        //nested for loop

        System.out.println(" below lines of code shows the execution of code 5 times again and again ");

        for (int i = 0; i < 5; i++) {//outer for loop
            for (int j = 0; j < 5; j++) {//inner for loop, the same sequence from 0 to 4 executes 5 times

                System.out.println(j);
            }
            System.out.println("****************************************");
        }

        System.out.println(" below lines of code shows the execution only once ");

        for (int k = 0; k < 5; k++) {//inner for loop, the same sequence from 0 to 4 executes 5 times

            System.out.println(k);
        }
        System.out.println("****************************************");
    }

}