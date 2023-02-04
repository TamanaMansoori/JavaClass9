package Class13StringBuilder;

public class StringVsStringBuilder {
    public static void main(String[] args) {

        // we should use string builder not string bc we are changing the value again and again
        String str="";
        for (int i = 0; i < 1000; i++) {
           str=str+i;
        }

        String str1="";
        for (int i = 0; i < 1000; i++) {
            str=str1+i;

        }
    }
}
