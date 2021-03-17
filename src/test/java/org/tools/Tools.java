package org.tools;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tools extends BaseClass {
public Tools() {
	PageFactory.initElements(driver, this);
}
	@FindBy(xpath="(//div[@class='trainer-info'])[5]")
	private WebElement scrollDown;
	
//	@FindBy(xpath="//span[text()='Latest Tutorials']")
//	private WebElement srollUp;
	
	public WebElement getScrollDown() {
		return scrollDown;
	}

//	public WebElement getSrollUp() {
//		return srollUp;
//	}
	
}

