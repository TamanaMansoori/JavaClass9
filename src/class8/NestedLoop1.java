package class8;

public class NestedLoop1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {//outer for loop
            for (int j = 0; j < 5; j++) {//inner for loop, the same sequence from 0 to 4 executes 5 times

                System.out.println("i = "+i+" j = "+j);
            }
            System.out.println("****************************************");
        }
    }
}
