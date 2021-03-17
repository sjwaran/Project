package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excercise {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver",
"C:\\Users\\user\\eclipse-workspace\\Maven1\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	
	WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
	search.sendKeys("iphone"+Keys.ENTER);
	
	WebElement first = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
	String text = first.getText();
	System.out.println(text);
	WebElement first1 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
	String text1 = first1.getText();
	System.out.println(text1);
	WebElement first2 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[3]"));
	String text2 = first2.getText();
	System.out.println(text2);
	WebElement first3 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[4]"));
	String text3 = first3.getText();
	System.out.println(text3);
	WebElement first4 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[5]"));
	String text4 = first4.getText();
	System.out.println(text4);
	WebElement first5 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[6]"));
	String text5 = first5.getText();
	System.out.println(text5);
	WebElement first6 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[7]"));
	String text6 = first6.getText();
	System.out.println(text6);
	WebElement first7 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[8]"));
	String text7 = first7.getText();
	System.out.println(text7);
	WebElement first8= driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[9]"));
	String text8 = first8.getText();
	System.out.println(text8);
	WebElement first9 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[10]"));
	String text9= first9.getText();
	System.out.println(text9);
	WebElement first10 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[11]"));
	String text10 = first10.getText();
	System.out.println(text10);
	
	File file=new File("C:\\Users\\user\\eclipse-workspace\\Maven1\\ExcelRead\\ExcelRead2.xlsx");
	
	FileInputStream stream=new FileInputStream(file);
	
	Workbook b=new XSSFWorkbook(stream);
	
	Sheet createSheet = b.createSheet("Jegatheesh1");
	Row createRow = createSheet.createRow(0);	
	Cell createCell = createRow.createCell(0);
	createCell.setCellValue(text);
	Row createRow1 = createSheet.createRow(1);	
	Cell createCell1 = createRow1.createCell(0);
	createCell1.setCellValue(text1);
	Row createRow2 = createSheet.createRow(2);	
	Cell createCell2 = createRow2.createCell(0);
	createCell2.setCellValue(text2);
	Row createRow3 = createSheet.createRow(3);	
	Cell createCell3 = createRow3.createCell(0);
	createCell3.setCellValue(text3);
	Row createRow4 = createSheet.createRow(4);	
	Cell createCell4 = createRow4.createCell(0);
	createCell4.setCellValue(text4);
	Row createRow5= createSheet.createRow(5);	
	Cell createCell5 = createRow5.createCell(0);
	createCell5.setCellValue(text5);
	Row createRow6 = createSheet.createRow(6);	
	Cell createCell6 = createRow6.createCell(0);
	createCell6.setCellValue(text6);
	Row createRow7= createSheet.createRow(7);	
	Cell createCell7 = createRow7.createCell(0);
	createCell7.setCellValue(text7);
	Row createRow8 = createSheet.createRow(8);	
	Cell createCell8 = createRow8.createCell(0);
	createCell8.setCellValue(text8);
	Row createRow9 = createSheet.createRow(9);	
	Cell createCell9= createRow9.createCell(0);
	createCell9.setCellValue(text9);
	Row createRow10 = createSheet.createRow(10);	
	Cell createCell10 = createRow10.createCell(0);
	createCell10.setCellValue(text10);
	
	FileOutputStream stream2=new FileOutputStream(file);
	
	b.write(stream2);
		
	
	
}
}
