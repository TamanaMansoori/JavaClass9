package class8;

public class NestedLoopDemo4 {
    public static void main(String[] args) {


        for (int i = 0; i < 3; i++) {

            if(i==1){//here we remove line in which the value of i is 1 then it skips the middle line on the console
                System.out.println();//makes empty line
                continue;
            }

            for (int j = 0; j < 5; j++) {
                System.out.print("*");// 5 stars in same line will be executed
            }
            System.out.println();//it makes speace between line

        }
    }
}
