package org.alert;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alert extends BaseClass{
public Alert() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="(//a[@class='login_button'])[1]")
private WebElement login;

public WebElement getLogin() {
	return login;
}

public WebElement getBtnClick() {
	return btnClick;
}
@FindBy(xpath="//input[@id='Button2']")
private WebElement btnClick;


}
