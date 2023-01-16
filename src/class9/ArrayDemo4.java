package class9;

public class ArrayDemo4 {
    public static void main(String[] args) {
        // we can update the letters from an array

        String []letters={"A", "B", "c", "d", "e", "f"};// we can use it with char as well.
        letters[0]="a"; //here we change the letter A to a
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);

        }
    }
}
