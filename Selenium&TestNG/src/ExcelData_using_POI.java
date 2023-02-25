import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData_using_POI {
	
	public static void main(String[] args) throws Throwable    {
		
		File src = new File("C:\\Testdata\\TestData_for_POI.xlsx"); // this is like
		// creating a objct for the file path and assigning it in inputstream

		FileInputStream excel = new FileInputStream(src); // using this to fetch the// sheet 

			XSSFWorkbook workbook = new XSSFWorkbook(excel); // this is used to load excel workbook
			

//		XSSFSheet sheet1 = workbook.getSheet("Sheet1"); // this is to specify the sheet in which the data is
//
//		String data0 = sheet1.getRow(0).getCell(0).getStringCellValue(); // this gets us the value that is in the (0,0)
//																			// cell in the sheet
//		System.out.println(data0);
		
		
	}

}
