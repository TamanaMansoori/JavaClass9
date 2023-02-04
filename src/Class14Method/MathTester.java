package Class14Method;

public class MathTester {
    public static void main(String[] args) {

        Math math=new Math();
        math.add(10,10);
        math.mul(2,3,4);


        //this belongs to line 17 of Math class
        int result=math.sub(100,50);
        System.out.println(result);


    }
}
