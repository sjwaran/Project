package org.greens;

import org.base.BaseClass;

public class AllMethods extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	BaseClass bc=new BaseClass();
	bc.getDriver();
	bc.getNavigate("http://www.greenstechnologys.com/");
	
	GreensTechnology gt=new GreensTechnology();
	bc.scrollDown(gt.getScollDown());
	bc.getAttribute(gt.getPrint(),"value");
	bc.thread(6000);
	bc.scrollUp(gt.getScrollUp());
	
	bc.btnClick(gt.getCertificate());
	bc.btnClick(gt.getCourseContent());
	bc.backword();
	bc.backword();
	bc.moveToElement(gt.getCourses());
	bc.moveToElement(gt.getJava());
	bc.moveToElement(gt.getCore());
	bc.btnClick(gt.getClick());
	bc.scrollDown(gt.getAnitha());
	
	
}
}
