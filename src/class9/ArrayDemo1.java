package class9;

public class ArrayDemo1 {
    public static void main(String[] args) {

        String [] names={"Slava", "Safi","Jason","Nabi","Anees","Joseph"};
// write a loop to print all the names from the array
        System.out.println(names.length); //how many eliminates are there in the array
       // for (int i = 0; i < names.length ; i++) {//we use this instate of writing the number of indexes

      //  }
        for (int i = 0; i < 6; i++) {
            System.out.println(names[i]);

        }
    }
}
