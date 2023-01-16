package homeWork;

public class HomeWork1Class9 {
    public static void main(String[] args) {
        /*
        1) Create an array of chars and store grades into it: A,B,C,D,E,F.
        Then print a grade B (use 2 different ways of creating an array).
         */

        char[]letters={'A','B','C','D','E','F'};
        for (int i = 0; i < letters.length; i++) {
            if(letters[i]=='B'){
                System.out.println(letters[1]);
            }

        }
    }
}
