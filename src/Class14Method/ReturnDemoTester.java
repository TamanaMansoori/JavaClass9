package Class14Method;

public class ReturnDemoTester {

    public static void main(String[] args) {

        ReturnDemo rd=new ReturnDemo();
        rd.method1();
        String str=rd.method1(); // assign the value and give back same
        //value of ReturnDemo class

        System.out.println(str);

        int result=rd.method2();
        System.out.println(result);
    }
}
