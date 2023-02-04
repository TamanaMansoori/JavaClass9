package homeWork;

public class Hw2Class12 {
    public static void main(String[] args) {
        /*
2) Create a String and print it in reverse order (Sunday → yadnuS).
         */

        String day="Sunday";
        char [] resultStr=day.toCharArray();
        for (int i = resultStr.length-1; i>=0; i--) {
            System.out.println(resultStr[i]);

        }

        System.out.println("+++++++++++++++++++second way++++++++++++++++++++++");
        String str1="Monday";
        for (int i = 5; i >=0; i--) {
            System.out.print(str1.charAt(i));

        }

    }
}
