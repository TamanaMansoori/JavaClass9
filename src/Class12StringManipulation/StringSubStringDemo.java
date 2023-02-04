package Class12StringManipulation;

public class StringSubStringDemo {

    public static void main(String[] args) {

        //here we only want part of below sentence
        String str="Send it to support channel. More Java";
        String newStr=str.substring(5);// here we ignore all 5 character in the sentence and print the character after letter 5
        System.out.println(newStr);


        System.out.println("****************************");

        //specify starting and ending point

        System.out.println(str.substring(0,27));
    }
}
