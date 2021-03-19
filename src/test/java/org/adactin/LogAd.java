package org.adactin;

import org.base.BaseClass;
import org.login.LoginPage;

public class LogAd {
	public static void main(String[] args) {
		BaseClass base;
		base=new BaseClass();
		base.getDriver();
		base.launchUrl("http://adactinhotelapp.com/");
		LoginPage lp=new LoginPage();
		base.enterText(lp.getTxtUserName(), "Gurusriramesh");
		base.enterText(lp.getTxtPassword(), "123456789");
		base.btnClick(lp.getBtnLogin());
		
	}

}
