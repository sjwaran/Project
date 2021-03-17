package org.retail;

import org.alert.Alert;
import org.base.BaseClass;

public class Retail extends BaseClass {
public static void main(String[] args) {
	BaseClass bc=new BaseClass();
	getDriver();
	launchUrl("https://retail.onlinesbi.com/retail/login.htm");
	
	Alert a=new Alert();
	bc.btnClick(a.getLogin());
	bc.btnClick(a.getBtnClick());
	bc.acceptAlert();
	
	
}
}
