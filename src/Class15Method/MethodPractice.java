package Class15Method;

public class MethodPractice {
    //create a method which returns true or false and takes the int number
    // as a parameter if number is even it returns true otherwise it returns false

    boolean isEven(int number) {
        boolean flag;
        if (number % 2 == 0) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    //second way

    boolean isEven1(int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //third way

    boolean isEven2(int number){
        return number%2==0;
    }
}


