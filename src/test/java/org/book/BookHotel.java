package org.book;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass{
public BookHotel() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//input[@name='first_name']")
private WebElement firstName;
@FindBy(xpath="//input[@name='last_name']")
private WebElement lastname;
@FindBy(xpath="//textarea[@name='address']")
private WebElement address;
@FindBy(xpath="//input[@name='cc_num']")
private WebElement cardno;
@FindBy(xpath="//select[@name='cc_type']")
private WebElement cardType;
@FindBy(xpath="//select[@name='cc_exp_month']")
private WebElement month;
@FindBy(xpath="//select[@name='cc_exp_year']")
private WebElement year;
@FindBy(xpath="//input[@name='cc_cvv']")
private WebElement cvv;
@FindBy(xpath="//input[@name='book_now']")
private WebElement book;;
public WebElement getFirstName() {
	return firstName;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCardno() {
	return cardno;
}
public WebElement getCardType() {
	return cardType;
}
public WebElement getMonth() {
	return month;
}
public WebElement getYear() {
	return year;
}
public WebElement getCvv() {
	return cvv;
}
public WebElement getBook() {
	return book;
}



}
