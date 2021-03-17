package org.adactin;

import java.io.IOException;
import java.util.List;

import org.base.BaseClass;
import org.book.BookHotel;
import org.bookCon.BookingConfirmation;
import org.hotel.SelectHotel;
import org.login.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.search.SearchHotel;

public class Adacitin extends BaseClass {
public static void main(String[] args) throws InterruptedException, IOException {
	BaseClass bc=new BaseClass();
	bc.getDriver();
	bc.launchUrl("https://adactinhotelapp.com/");
	
	LoginPage page=new LoginPage();
	WebElement txtUserName = page.getTxtUserName();
	bc.enterText(txtUserName, "Gurusriramesh");
	WebElement txtPassword = page.getTxtPassword();
	bc.enterText(txtPassword, "123456789");
	WebElement btnLogin = page.getBtnLogin();
	bc.btnClick(btnLogin);

	SearchHotel sh=new SearchHotel();
	WebElement location = sh.getLocation();
	bc.selectByVisibleText(location, "London");
	bc.selectByValue(sh.getHotels(), "Hotel Sunshine");
	bc.selectByVisibleText(sh.getRoomType(), "Double");
	bc.selectByVisibleText(sh.getNumberOfRoom(), "5 - Five");
	bc.selectByVisibleText(sh.getAdultsRoom(), "3 - Three");
	bc.selectByVisibleText(sh.getChildrensRoom(), "2 - Two");
	bc.btnClick(sh.getSearch());
	
	SelectHotel selectHotel=new SelectHotel();
	bc.btnClick(selectHotel.getClick());
	bc.btnClick(selectHotel.getContinueBtn());
	
	BookHotel bh=new BookHotel();
	bc.enterText(bh.getFirstName(), "jegatheeshwaran");
	bc.enterText(bh.getLastname(), "s");
	bc.enterText(bh.getAddress(), "chennai");
	bc.enterText(bh.getCardno(), "1234567890123456");
	bc.selectByVisibleText(bh.getCardType(), "VISA");
	bc.selectByVisibleText(bh.getMonth(), "December");
	bc.selectByVisibleText(bh.getYear(), "2022");
	bc.enterText(bh.getCvv(), "345");	
	bc.btnClick(bh.getBook());
	
	Thread.sleep(5000);
	BookingConfirmation  confirmation=new BookingConfirmation();
	bc.getAttribute(confirmation.getOrdernumber(), "value");
	
	bc.Screenshot("data");
	
	
	
	
	
			
}
}
