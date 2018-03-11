package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Upender\\Excel Data\\Test Data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet Sheet1 = wb.getSheetAt(0);
		int rowcount = Sheet1.getLastRowNum();
		for (int i=0;i<rowcount;i++){
			
			System.out.println("");
			String data0=Sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("The data from excel row  " + i + " is " + data0);
			String data1=Sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println("The data from row number row " + i + " is " + data1);
			
					
			
		}
		
	}
}

