package homeWork;

public class HomeWork5Class9 {
    public static void main(String[] args) {
        /*
        5) Create an array of size 5 on integers and calculate the sum of all elements in an array.
         */
        int sum=0;
        int[] num={13,67,89,45,34,22,99};
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];
        }
        System.out.println(sum);
    }
}
