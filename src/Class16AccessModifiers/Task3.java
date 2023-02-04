package Class16AccessModifiers;

public class Task3 {
    /*
    Write a method to return whether given number is prime or not?
    return type=boolean
    name of method= isPrime   this can be anyname
    parameter=int number
     */

    boolean isPrime(int number){

        boolean flag=true;
        if (number>1){
            for (int i = 2; i < number; i++) {
                if (number%i==0) {
                    flag = false;
                    break;
                }
            }

        }else {
            flag = false;
        }
      return flag;
    }


    public static void main(String[] args) {
        Task3 task3=new Task3();
        //task3.isPrime(13);
        System.out.println(task3.isPrime(13));
    }
}
