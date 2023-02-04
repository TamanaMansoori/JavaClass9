package class8NestedLoop;

public class NestedLoopDemo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {//outer for loop is controlling how many lines we write , so there will be 10 line and for each line 5 stars
            for (int j = 0; j < 5; j++) {//inner for loop, the same sequence from 0 to 4 executes 5 times
// inner loop shows how many stars we write
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("####################");
    }
}
