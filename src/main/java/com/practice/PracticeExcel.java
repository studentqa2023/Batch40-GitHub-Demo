package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeExcel {
	FileInputStream fis; //Instance variable
	XSSFWorkbook wb; 
	
	public void getExcelData(int rowIndex, int columnIndex) {
		
		//Find the Excel location or path
		File file =  new  File("./src/main/resources/LogIn_Test_Cases.xlsx");
		
		//Convert data to stream ⇒ FileInputStream class
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		//Apache POI methods to read the Excel
		//1st step =  read the whole excel  as a  workbook
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		//Call my Sheet as worksheet & get my sheet by index or sheet name
		XSSFSheet sht = wb.getSheetAt(0);
		//XSSFSheet sht1 = wb.getSheet("Practice1");
		
		//Find all rows
		int totalRow = sht.getPhysicalNumberOfRows();
		
		//Loop all rows
		for(int i =0; i<totalRow; i++) {
			if(i==rowIndex) {
				Row row = sht.getRow(i);
				//Total number of columns
				row.getLastCellNum();
				
				//Start another loop for column
				for(int j=0; j<totalRow; j++) {
					if(j==columnIndex) {
						Cell cell = row.getCell(j);
						
						System.out.println(cell.getStringCellValue());
					}
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		PracticeExcel obj = new PracticeExcel();
		obj.getExcelData(0, 0);
		obj.getExcelData(2, 1);
		obj.getExcelData(3, 3);
		obj.getExcelData(5, 1);
	}

}
