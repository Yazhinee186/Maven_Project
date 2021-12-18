package com.date_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven {
	
	public static void read_Particular_Data() throws IOException {
		
		System.out.println("Read one particular cell value");
		System.out.println();		
		File f=new File("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Student_Marks.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(4);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		
		if(cellType.equals(cellType.STRING)) {			
		String value = cell.getStringCellValue();
		System.out.println("The value of Sheet 1 , Row 5 and cell 2 is " + value);		
		}
		
		else if(cellType.equals(cellType.NUMERIC)) {
			double cellValue = cell.getNumericCellValue();
			int value=(int)cellValue;
			System.out.println("The value of Sheet 1 , Row 5 and cell 2 is " + value);
		}		
		System.out.println();
		System.out.println("------------------------");
			}
	
	
	public static void read_All_Data() throws IOException {
		
		System.out.println("Read all cell values");
		System.out.println();
		
		File f=new File("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Student_Marks.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		
		for (int i=0;i<numberOfRows;i++) {
			
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for(int j=0;j<numberOfCells;j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if(cellType.equals(cellType.STRING)) {			
					String value = cell.getStringCellValue();
					System.out.println(value);		
					}
					
					else if(cellType.equals(cellType.NUMERIC)) {
						double cellValue = cell.getNumericCellValue();
						int value=(int)cellValue;
						System.out.println(value);
					}				
			}
			
		}		
		System.out.println();
		System.out.println("------------------------");
		
	}
	
	public static void read_Row_Data() throws IOException {
		System.out.println("Read one entire row values");
		System.out.println();
		File f=new File("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Student_Marks.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(3);
		int numberOfCells = row.getPhysicalNumberOfCells();
		for(int i=0;i<numberOfCells;i++) {
			Cell cell = row.getCell(i);
			CellType cellType = cell.getCellType();
			if(cellType.equals(cellType.STRING)) {			
				String value = cell.getStringCellValue();
				System.out.println(value);		
				}
				
				else if(cellType.equals(cellType.NUMERIC)) {
					double cellValue = cell.getNumericCellValue();
					int value=(int)cellValue;
					System.out.println(value);
				}
			
		}		
		System.out.println();
		System.out.println("------------------------");
			
	}
	
	public static void read_Single_Column() throws IOException {
	
	System.out.println("Read one entire column values");
	System.out.println();
	File f=new File("C:\\Users\\Orpak\\eclipse-workspace\\Maven_Project\\target\\Student_Marks.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fis);
	Sheet sheetAt = wb.getSheetAt(0);
	int numberOfRows = sheetAt.getPhysicalNumberOfRows();
	for(int i=0;i<numberOfRows;i++) {
		Row row = sheetAt.getRow(i);
		Cell c = row.getCell(1);
		CellType cellType = c.getCellType();
		if(cellType.equals(cellType.STRING)) {			
			String value = c.getStringCellValue();
			System.out.println(value);		
			}
			
			else if(cellType.equals(cellType.NUMERIC)) {
				double cellValue = c.getNumericCellValue();
				int value=(int)cellValue;
				System.out.println(value);
			}
		

	}
	
	

	}
	
	public static void main(String[] args) throws IOException {
		
		read_Particular_Data();
		read_All_Data();
		read_Row_Data();
		read_Single_Column();
	}
	

}
