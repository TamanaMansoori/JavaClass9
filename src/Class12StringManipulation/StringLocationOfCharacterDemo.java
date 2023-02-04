package Class12StringManipulation;

public class StringLocationOfCharacterDemo {

    public static void main(String[] args) {

        String str="Java is not pain";
        System.out.println(str.indexOf("J"));
        System.out.println(str.indexOf("a"));//it gives us the first (a) and it counts the spaces too
        System.out.println(str.indexOf("p"));

        System.out.println("********************************************");


        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)+" has the index "+i);// we get all the indexes for all using loop

        }
    }
}
