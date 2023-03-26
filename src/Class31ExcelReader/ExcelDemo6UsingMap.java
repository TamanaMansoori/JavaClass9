package Class31ExcelReader;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class ExcelDemo6UsingMap {

    public static void main(String[] args) throws IOException {

        //store the data inside the list of map

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

        List<Map<String,String>> excelData=new ArrayList<>();

        for (int i = 1; i < noOfRows; i++) {
            Row row= sheet2.getRow(i);
            LinkedHashMap<String,String> rowMap=new LinkedHashMap<>();

            rowMap.put("UserName",row.getCell(0).toString());
            rowMap.put("Password",row.getCell(1).toString());
            excelData.add(rowMap);
        }

        System.out.println(excelData);

        }
}
