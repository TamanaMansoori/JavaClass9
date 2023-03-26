package Class31ExcelReader;

import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelFileDemoPracticalExample {
    public static void main(String[] args) throws IOException {

        //we can also use Var instead of line List Map
       // var excelData=ExcelReader.read();
        List<Map<String,String>> excelData= ExcelReader.read();
      //  Map<String,String> firstRow= excelData.get(1);//for each row we have a map
        //System.out.println(firstRow.get("Salary"));//we get Hamid from sheet1
       // System.out.println(firstRow);


        //write a loop to get all the data from sheet
        for (Map<String,String>row:excelData){
            for(var entr:row.entrySet()){//returning a set which
                System.out.println(entr.getKey()+" "+entr.getValue());
            }
            System.out.println("************************");
        }
    }
}
