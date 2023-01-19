package Class11;

public class Example1 {
    public static void main(String[] args) {
        //print the odd number from this array
        int[][] matrix = {{10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}
        };
        for (int i = 0; i < matrix.length; i++) {//give us the number of rows
            for (int j = 0; j < matrix[i].length; j++) {//  (matrix[i].length); this give is the size(each values) of each 1D array
                if(matrix[i][j]%2!=0);//give us odd numbers
                System.out.println(matrix[i][j]);
            }

        }
    }
}
