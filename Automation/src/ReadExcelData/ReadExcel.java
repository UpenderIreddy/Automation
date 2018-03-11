


package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main (String[]args) throws Exception{
		
		File f = new File("C:\\Upender\\Excel Data\\Test Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet Sheet1 = wb.getSheetAt(0);
		
		// Reading FIRST row and First Column/cell
		String data00 =Sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("The data passed from excel is " + data00);
		
		//Reading FIRST Row and SECOND Column/cell
		String data01=Sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("The data passed from excel is " + data01);
		
		//Reading SECOND row and FIRST column /cell
		String data10=Sheet1.getRow(1).getCell(0).getStringCellValue();
		System.out.println("The data passed from excel is " + data10);
		
		//Reading SECOND row and SECOND column/cell
		String data11 = Sheet1.getRow(1).getCell(1).getStringCellValue();
		System.out.println("The data passed from excel is " + data11);
		
		//Reading THIRD Row and FIRST column/cell
		String data20 = Sheet1.getRow(2).getCell(0).getStringCellValue();
		System.out.println("The data passed from excel is " + data20);
				
		//Reading THIRD Row and SECOND column/cell
		String data21 = Sheet1.getRow(2).getCell(1).getStringCellValue();
		System.out.println("The data passed from excel is " + data21);
		
		//Reading FOURTH Row and FIRST column
		String data30 = Sheet1.getRow(3).getCell(0).getStringCellValue();
		System.out.println("The data passed from excel is " + data30);
		
		//Reading FOURTH Row and SECOND Clumn
		String data31 = Sheet1.getRow(3).getCell(1).getStringCellValue();
		System.out.println("The data passed from excel is " + data31);
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	}

}
