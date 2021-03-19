package org.map;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class MapExcelRead {
public static void main(String[] args) throws IOException {
	Map<Integer,String> m=new TreeMap<Integer,String>();
	
	m.put(10, "java");
	m.put(20, "selenium");
	m.put(30, "oracle");
	m.put(40, "frame");
	
	Collection<String>  s = m.values();
	for (String string : s) {
		System.out.println(string);
	
	
	List l=new ArrayList();
	l.add(string);
	


for (int i = 0; i <l.size(); i++) {
	Object object = l.get(i);
	
File file=new File("C:\\Users\\user\\eclipse-workspace\\Maven1\\ExcelRead\\ExcelRead4.xlsx");

FileInputStream  stream=new FileInputStream(file);

Workbook b=new XSSFWorkbook(stream);

Sheet sheet = b.createSheet("onetwo ");

for (int j = 0; j <sheet.getPhysicalNumberOfRows(); j++) {
	
	Row createRow = sheet.createRow(j);
	for (int k = 0; k <createRow.getPhysicalNumberOfCells(); k++) {
		Cell createCell = createRow.createCell(k);
		createCell.setCellValue(string);

	}
}
FileOutputStream stream2=new FileOutputStream(file);
b.write(stream2);
}
}
}
}