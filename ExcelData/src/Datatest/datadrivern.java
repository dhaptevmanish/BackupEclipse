package Datatest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadrivern {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File src = new File("C:\\Testdata\\TestData.xlsx"); // this is like
		// creating a objct for the file path and assigning it in inputstream

		FileInputStream excel = new FileInputStream(src); // using this to fetch the
															// sheet
// nedw change 
		XSSFWorkbook workbook = new XSSFWorkbook(excel); // this is used to load excel workbook
		XSSFSheet sheet1 = workbook.getSheetAt(0);// this is to specify the sheet in which the data is

		// String data0 = sheet1.getRow(0).getCell(0).getStringCellValue(); // this gets
		// us the value that is in the (0,0)
		// cell in the sheet
//			int rowcount = sheet1.getLastRowNum();
		// when we get the last row we know the size so we r using that here
		String data = sheet1.getRow(1).getCell(0).getStringCellValue();

//System.out.println(rowcount);
		System.out.println(data);
		workbook.close();
		
		

	}

}
