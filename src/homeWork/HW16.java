package homeWork;

public class HW16 {
    /*
 2) Create a method that will take a String as a parameter and returns reversed String.
 Method should be available to all classes within your project and accessible by class name.

 parameter= String
     */

 /*   public String reverseString(String str){
  String newStr="";
  for (int i = str.length() - 1; i >= 0; i--) {
        newStr += str.charAt(i);

    }
        return newStr;*/

    //scond way
    public String reverseString(String input){
        return new StringBuilder(input).reverse().toString();
}

    public static void main(String[] args) {
       HW16 tester=new HW16();
       // System.out.println(tester.reverseString("Afghanistan"));
        tester.reverseString("Afghanistan");

//if the class is public static then we can use below code

        //tester.reverseString("Afghanistan");



    }
}

