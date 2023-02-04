package Class16AccessModifiers;

public class Task4 {
    /*
 Create a method that will accept an array as parameters
 and will return a sum of all elements from that array.
 Method should be visibly only within same package and accessible
 by the creating an instance of the class.

 return type = int
 name=sumArrayElement
 parameters=int [] arr
 access modifier= default
     */

    static int sumArrayElements(int [] array){
        int sum=0;
        for (int num:array) {
            sum+=num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] arr={10,25,35,45};
        Task4 task4=new Task4();//here we create the object here
        System.out.println(sumArrayElements(arr));
    }

}
