package com.date_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_Write {
	
public static void Write_Data() throws IOException {
	File f=new File("C:\\Excel\\Employee_details.xlsx");
	FileInputStream fis=new FileInputStream(f);
	Workbook wb=new XSSFWorkbook(fis);
	wb.createSheet("Employee").createRow(0).createCell(0).setCellValue("Employee Name");
	wb.getSheet("Employee").getRow(0).createCell(1).setCellValue("Employee ID");
	wb.getSheet("Employee").getRow(0).createCell(2).setCellValue("Designation");
	wb.getSheet("Employee").getRow(0).createCell(3).setCellValue("Phone Number");
	wb.getSheet("Employee").getRow(0).createCell(4).setCellValue("Email");
	
	wb.getSheet("Employee").createRow(1).createCell(0).setCellValue("John");
	wb.getSheet("Employee").getRow(1).createCell(1).setCellValue(23456);
	wb.getSheet("Employee").getRow(1).createCell(2).setCellValue("Manager");
	wb.getSheet("Employee").getRow(1).createCell(3).setCellValue(9789678768D);
	wb.getSheet("Employee").getRow(1).createCell(4).setCellValue("john@xyz.com");
	
	wb.getSheet("Employee").createRow(2).createCell(0).setCellValue("David");
	wb.getSheet("Employee").getRow(2).createCell(1).setCellValue(12334);
	wb.getSheet("Employee").getRow(2).createCell(2).setCellValue("Associate");
	wb.getSheet("Employee").getRow(2).createCell(3).setCellValue(567878768D);
	wb.getSheet("Employee").getRow(2).createCell(4).setCellValue("david@xyz.com");
	
	FileOutputStream fos=new FileOutputStream(f);
	wb.write(fos);;
	wb.close();
	System.out.println("Write Completed");
	
	}
	
public static void main(String[] args) throws IOException {
	
	Write_Data();
}

	





}