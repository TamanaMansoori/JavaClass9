package Class31ExcelReader;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelDemoGeneric {
    public static void main(String[] args) throws IOException {

        String path="File/Book1 (1).xlsx";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);

        Sheet sheet2=xssfWorkbook.getSheet("Sheet2");
        int noOfRows=sheet2.getPhysicalNumberOfRows();
        System.out.println(noOfRows);

        List<Map<String,String>> excelData=new ArrayList<>();

        //here we are replacing the line 33 and 34. line 28 contains the header of sheet
        Row row0= sheet2.getRow(0);//here we extract the row of 0
        for (int i = 1; i < noOfRows; i++) {
            Row row= sheet2.getRow(i);
            LinkedHashMap<String,String> rowMap=new LinkedHashMap<>();//linkedHashMap is created here

            //this is another for loop
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                rowMap.put(row0.getCell(j).toString(),row.getCell(j).toString());

            }
            /*rowMap.put("UserName",row.getCell(0).toString());
            rowMap.put("Password",row.getCell(1).toString());*/
            excelData.add(rowMap);//put the map inside the list
        }

        System.out.println(excelData);

    }
}
