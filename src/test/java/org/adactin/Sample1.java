package org.adactin;
import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.login.LoginPage;
import org.search.SearchHotel;
public class Sample1 extends BaseClass {
	static BaseClass baseClass;
@BeforeClass
public static void launchBrowser() {
	getDriver();
	launchUrl("https://adactinhotelapp.com/");

}@Before
public void beforeMethod() throws IOException {
	 baseClass=new BaseClass();
	Date date=new Date();
	System.out.println(date);
	baseClass.Screenshot("before login");

}@Test
public void tc0() throws IOException {
	LoginPage loginpage=new LoginPage();
	baseClass.enterText(loginpage.getTxtUserName(),baseClass.getDataFromExcel("C:\\Users\\user\\eclipse-workspace\\Maven1\\ExcelRead\\ExcelRead4.xlsx", "Sheet2", 1	, 0));
	Assert.assertEquals("Gurusriramesh", loginpage.getTxtUserName().getAttribute("value"));
	baseClass.enterText(loginpage.getTxtPassword(), baseClass.getDataFromExcel("C:\\Users\\user\\eclipse-workspace\\Maven1\\ExcelRead\\ExcelRead4.xlsx", "Sheet2", 1, 1));
	Assert.assertEquals("123456789", loginpage.getTxtPassword().getAttribute("value"));
	baseClass.btnClick(loginpage.getBtnLogin());
	
}@Test
public void tc1() {
	SearchHotel searchHotel=new SearchHotel();
	baseClass.selectByVisibleText(searchHotel.getLocation(), "Paris");
	baseClass.selectByValue(searchHotel.getHotels(), "Hotel Sunshine");
	baseClass.selectByVisibleText(searchHotel.getRoomType(), "Double");
	baseClass.selectByVisibleText(searchHotel.getNumberOfRoom(), "5 - Five");
	baseClass.selectByVisibleText(searchHotel.getAdultsRoom(), "3 - Three");
	baseClass.selectByVisibleText(searchHotel.getChildrensRoom(), "2 - Two");
	baseClass.btnClick(searchHotel.getSearch());
	

}

@After
public void afterMethod() throws IOException {
	Date date=new Date();
	System.out.println(date);
	baseClass.Screenshot("After Login");

}@AfterClass
public static void afterClass() {
	closeWindow();
}
}
