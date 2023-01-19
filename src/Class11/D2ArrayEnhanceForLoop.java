package Class11;

public class D2ArrayEnhanceForLoop {
    public static void main(String[] args) {
        //find the odd number with enhance for loop

        int[][] matrix = {{10, 20, 30},
                {45, 55, 66},
                {30, 40, 20, 10, 25}
        };
        for (int[] arr : matrix) {//complete 1D array

            for (int numbers : arr) {  //we get the individula numbers
                // for (int j = 0; j < arr.length; j++) {
                //   if (arr[j] % 2 == 0) {
                System.out.println(numbers);
            }
            System.out.println();

        }
//this give us odd number using enhance for loop
       /* for (int[] arr : matrix) {
            for (int j = 0; j < ints.length; j++) {
                if (arr[j] % 2 == 0) {
                    System.out.println(arr[j]);
                }
                System.out.println();
            }

        }*/

    }
}