package class7;

public class ForLoop4 {
    public static void main(String[] args) {
        // print this sequence 1 2 4 5 7 8 10 11 13 14 16 17 19;

        for(int i =0; i<20; i++){
           if(i%3!=0){ //it divides all the numbers by 3 and checks if the remainder is not zero.
               System.out.println(i);
           }
        }
    }
}
