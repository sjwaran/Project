package org.hotel;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
public SelectHotel() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//input[@name='radiobutton_0']")
private WebElement click;

@FindBy(xpath="//input[@name='continue']")
private WebElement continueBtn;

public WebElement getClick() {
	return click;
}

public WebElement getContinueBtn() {
	return continueBtn;
}
}
