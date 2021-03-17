package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	Select s;
	Actions action;
	
public static void getDriver() {
	WebDriverManager.chromedriver().setup();

	driver=new ChromeDriver();
	driver.manage().window().maximize();
}
public static void launchUrl(String url) {
	
	driver.get(url);
}
public void currentUrl(WebElement element) {
	((WebDriver) element).getCurrentUrl();

}public void title() {
	driver.getTitle();
}

public void enterText(WebElement element,String value) {
	element.sendKeys(value);
}

public void btnClick(WebElement element) {
	element.click();
}
public void quitWindow() {
	driver.quit();

}public static void closeWindow() {
	driver.close();

}public void printText(WebElement element) {
	String text = element.getText();
	System.out.println(text);

}public void getAttribute(WebElement element,String value) {
	String attribute = element.getAttribute(value);
	System.out.println(attribute);

}public void moveToElement(WebElement target) {
	Actions action=new Actions(driver);
	action.moveToElement(target).perform();

}public void dragAndDrop(WebElement source,WebElement target) {
	Actions action=new Actions(driver);
	action.dragAndDrop(source, target).perform();
}
public void rightClick(WebElement target) {
	Actions action =new Actions(driver);
	action.contextClick(target).perform();

}public void doubleClick(WebElement target) {
	Actions action=new Actions(driver);
	action.doubleClick(target).perform();

}public void acceptAlert() {
	Alert alert = driver.switchTo().alert();
	alert.accept();

}public void cancelAlert() {
	Alert alert = driver.switchTo().alert();
	alert.dismiss();
}public void Screenshot(String data) throws IOException {
	TakesScreenshot ts=(TakesScreenshot) driver;
	File screenShotAs = ts.getScreenshotAs(OutputType.FILE);
	File file=new File(System.getProperty("user.dir")+"\\target\\"+data+".png");
	FileUtils.copyFile(screenShotAs, file);
}
public void scrollDown(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true)", element);

}public void scrollUp(WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(false)", element);

}public void enterTextJavaScript(String value,WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript(value, element);
}public void returnPrintJavaScript(String value,WebElement element) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript(value, element);

}public void selectByValue(WebElement element,String value) {
	Select s=new Select(element);
	s.selectByValue(value);

}public void selectByIndex(WebElement element,Integer index) {
	Select s=new Select(element);
	s.selectByIndex(index);
}
public void selectByVisibleText(WebElement element,String value) {
		Select s=new Select(element);
		s.selectByVisibleText(value);
	}
	
public void deselectByValue(WebElement element,String value) {
	Select s=new Select(element);
	s.deselectByValue(value);

}
public void deselectByVisibleText(WebElement element,String value) {
	Select s=new Select(element);
	s.deselectByVisibleText(value);
}public void deselectByIndex(WebElement element,Integer index) {
	Select s=new Select(element);
	s.deselectByIndex(index);
}public void getOptions(WebElement element) {
	Select s=new Select(element);
	s.getOptions();

}public void isMultiple(WebElement element) {
	Select s=new Select(element);
	s.isMultiple();

}public void frameIndex(Integer index) {
	driver.switchTo().frame(index);

}
public void frameString(String value) {
	driver.switchTo().frame(value);

}public void frameXpath(String value) {
	driver.switchTo().frame(value);

}public String getDataFromExcel(String pathName,String sheetName,int rowNo,int cellNo) throws IOException {

File file=new File(pathName);
FileInputStream fileInputStream =new FileInputStream(file);
Workbook workbook=new XSSFWorkbook(fileInputStream);
Sheet sheet = workbook.getSheet(sheetName);
Row row = sheet.getRow(rowNo);
Cell cell = row.getCell(cellNo);
int cellType = cell.getCellType();
String value=" ";
if(cellType==1) {
	 value = cell.getStringCellValue();
}
else if (DateUtil.isCellDateFormatted(cell)) {
	Date dateCellValue = cell.getDateCellValue();
	SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
	 value = dateFormat.format(dateCellValue);
}else {
	double numericCellValue = cell.getNumericCellValue();
	long l=(long) numericCellValue;
	 value = String.valueOf(l);
}
return value;
}public void thread(int mills) throws InterruptedException {
	Thread.sleep(mills);

}public void backword() {
	driver.navigate().back();

}public void forword() {
	driver.navigate().forward();

}public void refresh() {
	driver.navigate().refresh();

}public void getNavigate(String url) {
	driver.navigate().to(url);

}
}


