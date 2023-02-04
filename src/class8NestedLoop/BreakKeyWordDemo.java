package class8NestedLoop;

public class BreakKeyWordDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if(i==6){//when it comes to 6 it breaks the loop and there will be no execution from 6 and on
                break;// we completely get out of the code and once the if condition is true there will be no execution after that
            }
            System.out.println(i);
        }
        System.out.println("Last line in our code");

    }
}
