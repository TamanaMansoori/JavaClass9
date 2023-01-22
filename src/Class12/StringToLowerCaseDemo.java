package Class12;

public class StringToLowerCaseDemo {

    public static void main(String[] args) {

        //converts upper to lower case

        String str="JAVA is FUN";
        String newStr=str.toLowerCase();//convert all the upper case letters to lower case
        System.out.println(newStr);//this give us the output
        //if we add number to it, there will be no change in numbers and special characters except the string letters

        System.out.println("*********************************************************");

        String str2="i love java";
        String str2Upper=str2.toUpperCase();
        System.out.println(str2Upper);
    }
}
