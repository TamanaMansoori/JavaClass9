package Class15Method;

public class MethodPractice3Return {

    public static void main(String[] args) {

        //create the object of the class that has the method objectname.methodname

        MethodPractice3 method=new MethodPractice3();
        int[] array={10,20,30};
        System.out.println(method.arraySum(array));

        System.out.println(method.arraySum(new int[]{10,10,10}));
    }
}
