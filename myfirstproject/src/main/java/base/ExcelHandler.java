package base;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelHandler {


   public static Object[][] getExcelData(String SheetName, int row, int column){
       Object[][] data=null;
        FileInputStream fileInputStream;
        try {
            fileInputStream=new FileInputStream (new File("C:\\Users\\ShivShubh\\Downloads\\Book1.xlsx"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        XSSFWorkbook workbook;

        try {

            workbook= new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
       XSSFSheet sheet = workbook.getSheet(SheetName);
        sheet.getRow(0).getLastCellNum();
        data=new Object[row-1][column];
        for(int i=1;i<row;i++) {
            Row row1=sheet.getRow(i);
            for (int j=0;j<column;j++){
                data[i-1][j]=row1.getCell(j).getStringCellValue();
            }
        }
        return data;

   }
        

   }















