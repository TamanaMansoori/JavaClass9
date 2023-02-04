package Class10D2Array;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {

        //only print the odd numbres
        int[] num = {10, 13, 20, 25, 45, 60};
        // for(int number:num){
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 != 0) {
                num[i]=0;  //here we replace the value of zero to the odd numbers
                System.out.println(num[i]);
            }
        }
        //num[1]=0; this is how we update a single element in an array or replace new value to an array
        // replace all the odd number in this arr to zero and do it with the help of normal loop




    }
}