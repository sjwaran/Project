package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {
	public static void main(String[] args) throws IOException {
		File file=new File
		("C:\\Users\\user\\eclipse-workspace\\Maven1\\ExcelRead\\ExcelRead.xlsx");
		
		FileInputStream stream=new FileInputStream(file);
		
		Workbook b=new XSSFWorkbook(stream);	
		Sheet sheet = b.getSheet("Sheet1");

		for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);
			}
		}
		
	}
}
