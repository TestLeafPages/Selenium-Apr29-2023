package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static String[][] readExcel(String filename) throws IOException {
		//Open Workbook with filename and path
		XSSFWorkbook wb = new XSSFWorkbook("./data/"+filename+".xlsx");
		//Go to the Specific sheet using index/sheet name
		XSSFSheet sheet = wb.getSheetAt(0);
		//Find the total number of rows
		int rowCount = sheet.getLastRowNum();
		System.out.println("Total no : of rows : "+ rowCount);
		//Find the total number of columns
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println("Total number of columns: "+columnCount);
		//read a specific data
		
		XSSFCell cell = sheet.getRow(1).getCell(0);
		String firstrowfirstcolumnData = cell.getStringCellValue();
		System.out.println("firstrowfirstcolumnData : "+firstrowfirstcolumnData);
		String[][] data = new String[rowCount][columnCount];
		//to read all datas from excel
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < columnCount; j++) {
				String stringCellValue = row.getCell(j).getStringCellValue();
				System.out.println(stringCellValue);
				data[i-1][j]=stringCellValue;//data[0][0] = "TestLeaf"
			}
			
		}
		
		wb.close();
		return data;
	}

}
