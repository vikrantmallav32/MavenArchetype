package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.testng.annotations.Test;

public class ExcelDatadrive {
  @Test
  public void Exceldataread	() throws IOException 
  {
	  File f1=new File("./"+"\\TestData\\data.xlsx");
	  FileInputStream fs= new FileInputStream(f1);
	  
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  String cell30=wb.getSheet("sheet1").getRow(5).getCell(0).getStringCellValue();
	  System.out.println("Cell Value is:-"+cell30);
	  
	  
	  
	  
	  
  }
}
