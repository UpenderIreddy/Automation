package ReadExcelData;

import lib.ExcelConfigData;

public class ReadingData_Excel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExcelConfigData excel = new ExcelConfigData("C:\\Upender\\Excel Data\\Test Data.xlsx");
		System.out.println(excel.getData(0, 0, 1));
		
		
		
		
		
		

	}

}
