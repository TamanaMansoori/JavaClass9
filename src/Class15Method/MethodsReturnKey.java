package Class15Method;

import java.util.Scanner;

public class MethodsReturnKey {

    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
         int num=scanner.nextInt();

        System.out.println("You entered "+num);

        Method method=new Method();
        method.doSomeThing();

        Method method2=new Method();
        int a=method.method2();

        Method method3=new Method();
        String str=method.method3();
    }
}
