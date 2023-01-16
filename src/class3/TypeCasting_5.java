package class3;

public class TypeCasting_5 {
    public static void main(String[] args) {

        long number=125;
       // byte shorterNumber=number; here we get error but we still want to print the value by the help of TypeCasting

        byte shorterNumber=(byte) number; //type casting
        float f=10.5f;
        int num=(int)f; //type casting, when we exicute it, we will only have the 10 on consule not the one which is after decimal. becasue we stored it inside the int type.
        System.out.println(shorterNumber);
        System.out.println(num);
        /*
        sequence of numbers from small to big
        byte
        short
        int
        long
        float
        double

        if we try to store the contents from a smaller box to a larger box Java dosn't complain but if we do the apposite
        then we get error and we need to type cast it to store the contents.
         */

        byte b=10;
        int number2=b; // reassigning the value of b to the new variable which is number2
        short c=(short) number2;
        System.out.println(b);

        float eggs=12.5f;
        int wholePart=(int)eggs;
        System.out.println(wholePart);//here we only get the whole number not the dicemel because the variable is with (int)





    }
}
