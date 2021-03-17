package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Sample3 {
public static void main(String[] args) throws IOException {
	File file=new File("C:\\Users\\user\\eclipse-workspace\\Maven1\\ExcelRead\\ExcelRead.xlsx");
	
	FileInputStream stream=new FileInputStream(file);
	
	Workbook b=new XSSFWorkbook(stream);
	
	Sheet sheet = b.getSheet("jei");
	
	for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
		
		Row row = sheet.getRow(i);
		
		for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
			
			Cell cell = row.getCell(j);
			int cellType = cell.getCellType();
			
		if (cellType==1) {
			String s = cell.getStringCellValue();
			System.out.println(s);
			
		} else if(DateUtil.isCellDateFormatted(cell)){
			Date date = cell.getDateCellValue();
			SimpleDateFormat d=new SimpleDateFormat("dd-MM-yyyy");
			String save = d.format(date);
			System.out.println(save);

		}else {
			double n = cell.getNumericCellValue();
			long l=(long) n;
			System.out.println(l);
		}
			
		}
		
	}
}
}
