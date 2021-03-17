package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample4 {
public static void main(String[] args) throws IOException {
	File file=new File("C:\\Users\\user\\eclipse-workspace\\Maven1\\ExcelRead\\ExcelRead.xlsx");
	
	FileInputStream stream=new FileInputStream(file);
	
	Workbook b= new XSSFWorkbook(stream);
	
	Sheet createSheet = b.createSheet("jei1");
	
	Row createRow = createSheet.createRow(4);
	
	Cell createCell = createRow.createCell(3);
	
	createCell.setCellValue("jegatheesh");
	
	FileOutputStream stream1=new FileOutputStream(file);
	
	b.write(stream1);
}
}
