package Class10;

public class ArrayDemo1 {
    public static void main(String[] args) {

/* Array allow us to store multiple values in a single variable. we use indexes to ge back the value.
why array?? if we have to store alot of values it becomes very hard to manage alot of variables
we can create array in 2 ways.
1) DataType[] arr(varibale)={element1, element2, element3}
System.out.println(arr[1]); here we are printling element2 .
2) empty array:
DataType[] arr=new DataType[size];

 */
 int [] num={1,2,3,4,5};
        System.out.println(num[4]);// we get 5 here
        System.out.println(num[2]+" "+num[3]); //2 numbers in same line
        //below we print all element
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }
        System.out.println("************below is enhance for loop********************");

        for (int number:num) {
            System.out.println(number);

            //whenever possible use enhance for loop

        }


    }
}
