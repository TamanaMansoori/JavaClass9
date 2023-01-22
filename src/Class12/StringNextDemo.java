package Class12;

public class StringNextDemo {
    public static void main(String[] args) {

        //we get specific letters from a word or sentence and we count it as we count the array index

        String str="Java is Love";
        char character=str.charAt(0);//we get J as output and counts the spaces as well
        System.out.println(character);

        System.out.println("***********************************************************");

        for (int  i= 0;  i < str.length(); i++) {//this will print all the letters one by one
            System.out.println(str.charAt(i));
        }

        System.out.println("*************************************************************");
        //count how many (a) is inside that str

        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){
                  sum++;
            }

        }
        System.out.println(sum);
    }
}
