package Class12StringManipulation;

public class StringTrimDemo {
    public static void main(String[] args) {

        //if there is space before or after the word mean in the start or end of the word

        String str=" java ";
        System.out.println(str.trim());  // output is (java) not ( java )

        //it dosen't remove the space in between the word. ex: " Ja v a"


    }
}
