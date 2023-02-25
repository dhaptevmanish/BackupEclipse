package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	
	public ExcelDataProvider() throws IOException {
		
		File src = new File (System.getProperty("user.dir")+"/TestData/TestData_for_POIX.xlsx");
		FileInputStream fi = new FileInputStream(src);
		
		 wb = new XSSFWorkbook(fi);
		  sheet1 = wb.getSheetAt(0);
		 

	}
	public String testdata() {
		 String data =	sheet1.getRow(0).getCell(0).getStringCellValue();
		return data;  
	}
	
	
	
	public String getStringData (int sheetname, int row, int coloumn) 
	{
		return wb.getSheetAt(sheetname).getRow(row).getCell(coloumn).getStringCellValue();
	}
	
	
	public String getStringData (String sheetname, int row, int coloumn) 
	{
		return wb.getSheet(sheetname).getRow(row).getCell(coloumn).getStringCellValue();
	}
	
	public double getNumericData (String sheetname, int row, int coloumn) 
	{
		return wb.getSheet(sheetname).getRow(row).getCell(coloumn).getNumericCellValue();
	}

}
