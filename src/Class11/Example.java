package Class11;

public class Example {
    public static void main(String[] args) {
//wrtite a loop to print all the elemnt from this 2D array

        int[][] matrix = {{10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}
        };
        for (int i = 0; i < matrix.length; i++) {//give us the number of rows
            for (int j = 0; j < matrix[i].length; j++) {//  (matrix[i].length); this give is the size(each values) of each 1D array
                System.out.println(matrix[i][j]);
            }
            System.out.println();
        }
    }
}