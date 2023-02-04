package Class13StringBuilder;

public class StringRecap {
    public static void main(String[] args) {

        //how to print all the letters from this string ony by one

        String str="Java is Great";
        for (int i = 0; i <str.length(); i++) {
            System.out.println(str.charAt(i));

        }

        //count how many times the letter a has appearted in the aboce string

        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a');
            count++;
        }
        System.out.println("Letter");
    }
}
