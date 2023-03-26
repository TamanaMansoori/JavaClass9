package Class15Method;

public class MethodPractice2 {
    //create a method that takes a String reverse it and return the revsered String
    //call the method reversStr

    String reverseStr(String input){
        String newStr="";
        for (int i = input.length() - 1; i >= 0; i--) {
            newStr+=input.charAt(i);
        }
        return newStr;
    }

    //using string builder

    String reverseStr1(String input){
        return new StringBuilder(input).reverse().toString();
    }
        }
