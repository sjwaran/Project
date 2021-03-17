package org.bookCon;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmation extends BaseClass{
public BookingConfirmation() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@name='order_no']")
private WebElement ordernumber;
public WebElement getOrdernumber() {
	return ordernumber;
}
}
