package class32ExceptionHandler;


import utils.ExcelReader;

import java.io.IOException;


public class ExceptionDemo2 {
    public static void main(String[] args) throws IOException {
        //in the below lines we are writing wrong code but we don't get error during compile

         //error in run time
        //here we don't write proper code
       // System.out.println(10/0);

        //error in run time
       // int [] arr={10,20,30};
       // System.out.println(arr[5]);
//Note:if both try and catch doesn't work then we can use nested try catch block

        //here we get error in read method, and we can use try catch block
        //here we say try line 25 if doesn't work then catch other method which is line 26 AND 27
        try {
            ExcelReader.read();
        } catch (IOException e) {
            throw new RuntimeException(e);


        }
    }
}
