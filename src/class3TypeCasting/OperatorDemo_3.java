package class3TypeCasting;

public class OperatorDemo_3 {
    public static void main(String[] args) {

        int number=10;
        System.out.println(number/3);  //here we divide are we are doing the division 10 to 3 and since we have the data type as int so we get 3 as a result
        System.out.println(number%3);  //here we find the modulus of it which is the remainder of this. modulus always give us the remainder.

        System.out.println(16%4); //equally divided and no remainder. we get zero in result
        System.out.println(16/4); // here we do the division . we get 4 in result

        // modulus helps us find if a number is even or odd
        // even number: if a number can't be divided completely by 2 and the  reminder is other number than zero, it is even number

        System.out.println(156%2);
        System.out.println(155%2); //we always take the modulus by 2 if the answe is zero, it is an even number otherwise it is an odd number

        System.out.println(1555%5); // ATTENTION: here we check if the number is completely dividable if the result is zero then yes it is dividable
        // in line above, we are not checking if it is odd or even. for even and odd number we modulus to 2 not any other number.





    }
}
