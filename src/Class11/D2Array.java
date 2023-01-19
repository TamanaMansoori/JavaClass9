package Class11;

import java.util.Arrays;

public class D2Array {
    public static void main(String[] args) {
        int[][]matrix= {{10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}


        };
        System.out.println(matrix[2][4]);//2 is the row  and 4 is the indix
        System.out.println(Arrays.toString(matrix[0]));//it prints all the values
        for (int i = 0; i < matrix[0].length; i++) {//all the elements from first array(10,20,30)
            System.out.println(matrix[0][i]);//zero shows the row and i each the elements
        }

        int[]arr=matrix[0]; //it also give us the elemets from row 0
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        for (int i = 0; i < matrix[2].length; i++) {//this will print all the elemets from row 2 which is last array
            System.out.println(matrix[2][i]);
        }


    }
}
