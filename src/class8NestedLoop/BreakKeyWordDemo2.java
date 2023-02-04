package class8NestedLoop;

public class BreakKeyWordDemo2 {
    public static void main(String[] args) {
        int temp2=75;

        while(temp2<=105) {
            if (temp2 <= 100) {
                System.out.println("I love summber because Temperature is " + temp2);
            } else {
                System.out.println("It is very hot " + temp2);
            }
            temp2 += 5;
        }
    }
}
