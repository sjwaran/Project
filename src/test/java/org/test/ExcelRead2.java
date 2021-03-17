package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		File file=new File
		("C:\\Users\\user\\eclipse-workspace\\Maven1\\ExcelRead\\ExcelRead.xlsx");
		
		FileInputStream stream=new FileInputStream(file);
		
		Workbook b=new XSSFWorkbook(stream);	
		Sheet sheet = b.getSheet("Sheet1");

		int row = sheet.getPhysicalNumberOfRows();
		System.out.println(row);
	
		Thread.sleep(5999);
		
		
			}
}
