package class9;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //here we can creat an empty variable with array

        int[] numbers=new int[5];// empty array of size 5 will be created, and we can only initialize 5 number in this array
       // System.out.println(numbers[2]);//we get zero here becasue we haven't assigned any value to it

        numbers[0]=50;
        numbers[1]=30;
        numbers[2]=50;
        numbers[3]=60;
        numbers[4]=52;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
    }
}
