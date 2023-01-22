package Class12;

public class StringEqualDemo {
    public static void main(String[] args) {

        String str="Java";
        String str2="Java";

        boolean areEqual=str.equals(str2);
        System.out.println(areEqual);//the ouput of this method is boolean (false or True), this method is case sensitive

        System.out.println("**********************************************************");

        String str3="Java";
        String str4="JAVA";
        boolean areEqual2=str3.equals(str4);
        System.out.println(areEqual2);

        System.out.println("********************************************************");


        String str5="Java";
        String str6="JAVA";
        boolean areEqual3=str5.equalsIgnoreCase(str6);
        System.out.println(areEqual3);


    }
}
