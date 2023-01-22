package Class12;

import java.util.Locale;

public class StringStartsWithDemo {

    public static void main(String[] args) {

        //it check the start letter of the word
         String str="I Love java";
         boolean startsWith=str.startsWith("I");
        System.out.println(startsWith);// true

        boolean startsWith2=str.startsWith("i");// false
        System.out.println(startsWith2);//fasle


        System.out.println("*************Ends With***************");

        String str2="java";
        boolean startsWith3=str2.endsWith("a");
        System.out.println(startsWith3);// true

        System.out.println("*******************one method inside the other ***************");

        String str6="I Love java";
        boolean startsWith7=str6.startsWith("I");
        System.out.println(str6.toLowerCase(Locale.ROOT).startsWith("i"));

        System.out.println(str6.contains("java"));//true

    }
}
