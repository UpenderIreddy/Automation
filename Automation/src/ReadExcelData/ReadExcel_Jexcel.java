package ReadExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel_Jexcel {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		File f = new File("C:/Upender/Excel Data/TestDataForJexcel.xls");
			
		//FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = Workbook.getWorkbook(f);
		
		Sheet sheet1 = wb.getSheet(0);
		
		String data = sheet1.getCell(1,0).getContents();
		
		System.out.println("The data is " + data);
		
	     int rows=wb.getSheet(0).getRows();
		int rows1= Workbook.getWorkbook(f).getSheet(0).getRows();
		 int columns=wb.getSheet(0).getColumns();
		 int columns1=Workbook.getWorkbook(f).getSheet(0).getColumns();
		
		System.out.println("The rows are " + rows);
		System.out.println("The rows are " + rows1);
		System.out.println("The columns are " + columns);
		System.out.println("The columns are " + columns1);
		
		
		
		
		

	}

}
