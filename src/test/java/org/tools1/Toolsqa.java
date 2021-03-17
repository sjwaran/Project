package org.tools1;

import org.base.BaseClass;
import org.jsoup.Connection.Base;
import org.openqa.selenium.WebElement;
import org.tools.Tools;

public class Toolsqa extends BaseClass{
public static void main(String[] args) throws InterruptedException {
	BaseClass bc=new BaseClass();
	bc.getDriver();
	bc.launchUrl("http://www.greenstechnologys.com/");
	
	Tools tools=new Tools();
	WebElement scrollDown = tools.getScrollDown();

	bc.scrollDown(scrollDown);
//	Thread.sleep(5000);
//	bc.scrollUp(tools.getSrollUp());
}
}
