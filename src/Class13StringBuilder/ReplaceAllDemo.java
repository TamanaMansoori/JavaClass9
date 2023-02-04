package Class13StringBuilder;

public class ReplaceAllDemo {
    public static void main(String[] args) {

        //if we want to remove number or special characters or upper case. lowe case.
        //regular exprecion to identify this kind of pattren

        String str="kJAOIUYTHGTYUIlloiuuh1234876543%%%%**&&$$##({)";
        //(regex) regular exprecions
        System.out.println(str.replaceAll("[A-Z]","#"));//anything starts from A to Z find it and replace it to #
        System.out.println(str.replaceAll("[J-U]","*"));
        System.out.println(str.replaceAll("[a-z]","@"));// a to z which is in lowerCase
        System.out.println(str.replaceAll("[0-9]","&"));

        //multiple ranges
        System.out.println(str.replaceAll("[A-Za-z]","^"));//all letters a to z both upperCase and lowerCase
        System.out.println(str.replaceAll("[A-Za-z0-9]","!"));

        System.out.println(str.replaceAll("[^A-Za-z0-9]","!"));//(^)this symbul mean do not replace A-Z a-z and 0-9

        System.out.println(str.replaceAll("[A-Za-z0-9]",""));//if we don't put anything in "" then it will remove those characters or numbers


    }
}
