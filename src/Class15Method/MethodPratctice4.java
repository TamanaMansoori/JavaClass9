package Class15Method;

public class MethodPratctice4 {

    /*
    create a method that takes 2 numbers as parameters and return the larger number
    return type=int
    name of method = largerNumber
    parameters=int num1, int num2
    {
    if
    }
     */

    int largerNumber(int num1, int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }

    public static void main(String[] args) {

        MethodPratctice4 method=new MethodPratctice4();
        System.out.println(method.largerNumber(12,13));

    }


}
