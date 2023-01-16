package class9;

public class ArrayDemo6 {
    public static void main(String[] args) {
        double[] arr={10.5, 12.0, 45, 10.5, 23, 10.5};
        //write a program that tell us how many times the number 10.5 is present in the array
        int countAll=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==10.5){// arr[i] is the element
                countAll++; //or increase by 1

            }
        }
        System.out.println(countAll);
    }
}
