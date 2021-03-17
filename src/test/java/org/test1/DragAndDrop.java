package org.test1;

import org.base.BaseClass;
import org.jsoup.Connection.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDrop extends BaseClass{
public DragAndDrop() {
	PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="(//a[@class='button button-orange'])[5]")
	private WebElement drog;
	
	@FindBy(xpath="(//li[@class='placeholder'])[1]")
	private WebElement drop;

	public WebElement getDrog() {
		return drog;
	}

	public WebElement getDrop() {
		return drop;
	}
}
