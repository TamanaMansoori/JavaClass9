package Class10D2Array;

public class D2ArrayWithForLoop {
    public static void main(String[] args) {

        int [][] matrix= {{10, 20, 30},
                {55, 25, 35},
                {100, 200, 300},

        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]+" ");

            }
            System.out.println();

        }

    }
}
