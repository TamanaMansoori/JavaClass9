package homeWork;

public class HW2Class16 {
    /*
    3) Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed
    by calling it is name.

    parameter= String str
    return= String
    name=getOnlyVowels
     */

    private String vowelLetter(String str){
        String newStr=str.replaceAll("[^aeiou]","");
        return newStr;
    }
    //here if we make the class as static then we can use below codes
    //return str.replaceAll("[^aeioy]","");

    public static void main(String[] args) {
        HW2Class16 tester=new HW2Class16();
        System.out.println(tester.vowelLetter("wetyasdoiweruu"));

        //System.out.println(vowelLetter("JAVA"));
    }
}
