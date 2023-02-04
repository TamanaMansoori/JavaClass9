package class3TypeCasting;

public class VariablesDemo_2 {
    public static void main(String[] args) {

        /*
        to rename something , right click refector->rename
         */
        int number=10;
        System.out.println(number);

        number=20; //here we are reassigning a different value to the same variable and we get both value 10 and 20. the
        //reason is because java exicute the code from top to buttom
        System.out.println(number);

        int age=10;
        number=age; //here I am saying to java to replace the value of number with the value of age variable
        System.out.println(age);

        age=number+10; //here we add 10 to the variable number which is value is aredy 10, so 10+10 we get the value
        System.out.println(age);


    }
}
