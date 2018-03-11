package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfigData {
	
	 XSSFWorkbook wb;
	 XSSFSheet sheet1;
	
	public ExcelConfigData(String excelpath){
		
		try{
			
		
		File f = new File(excelpath);
		FileInputStream fis = new FileInputStream(f);
		 wb = new XSSFWorkbook(fis);
		 
		}
		
		catch(Exception e){
			System.out.println(e.getMessage());
			
			
			
		}
		
	}
	
	
		
		public String  getData (int sheetNumber, int row, int cell){
			
			
				sheet1 = wb.getSheetAt(sheetNumber);
				String data = sheet1.getRow(row).getCell(cell).getStringCellValue();
				return data;
			}
		
		public int getRowNum (int SheetIndex)	{
			
			int rows = wb.getSheetAt(SheetIndex).getLastRowNum();
			
			rows= rows+1;
			
			return rows;
		}
		
		
			
			
			
		}
		
		
		
	


