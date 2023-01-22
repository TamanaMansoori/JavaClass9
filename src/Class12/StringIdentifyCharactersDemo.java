package Class12;

public class StringIdentifyCharactersDemo {

    public static void main(String[] args) {

        //how to identify if the character is a letter , number or special character

        String str = "werfdff 34567 &*^%$";

        int count = 0;

        for (int i = 0; i < str.length(); i++) {


            if (Character.isAlphabetic(str.charAt(i))) {
            // Character is a class here
              //  if(Character.isDigit(str.charAt(i)))  here we count the numbers inside this str variable
                count++; //if alphabit we count it
            }
        }
        System.out.println("Total Alphabetic in Str is "+count);



        for (int i = 0; i < str.length(); i++) {


            if(Character.isDigit(str.charAt(i))) {

                count++;
            }
        }
        System.out.println("Total digits in Str is "+count);
    }
}