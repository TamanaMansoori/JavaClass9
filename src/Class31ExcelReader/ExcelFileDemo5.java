package Class31ExcelReader;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFileDemo5 {
    public static void main(String[] args) throws IOException {

        String path="File/Book1 (1).xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);

        //this class comes from the Jars that we uploaded while installing the Maven
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        //use to method from XSSFWorkbook to read and write the data
        Sheet sheet2=xssfWorkbook.getSheet("Sheet2");
        //the below method shows how many row contains data in the excel sheet, we have lots of rows but we only need the one that
        //has data.
        int noOfRows=sheet2.getPhysicalNumberOfRows();
        System.out.println(noOfRows);

        //we write a loop to go through all the data
        for (int i = 0; i <noOfRows ; i++) {
            //to get all the rows one by one from the sheet
            Row row= sheet2.getRow(i);//we can also use var here
            /*
            replace below code with a nested for loop
             */
         //   System.out.println(row.getCell(0)+" "+row.getCell(1));

            //here we replace same line 35 with the nested for loop
            int noOfCells=row.getPhysicalNumberOfCells();
            for (int j = 0; j < noOfCells; j++) {
                System.out.println(row.getCell(j)+" ");
            }
            System.out.println();

            //below is another enhance for loop and for all these ways we get the same result

         /*   for (Cell cell : row) {
                System.out.println(cell);
            }*/
        }
    }
}
