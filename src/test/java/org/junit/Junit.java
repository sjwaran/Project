package org.junit;

import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;
import org.login.LoginPage;
import org.openqa.selenium.WebElement;

public class Junit extends BaseClass {
	BaseClass bc;
	@BeforeClass
	public static void browserLaunch() {
		
		getDriver();
		launchUrl("https://adactinhotelapp.com/");

	}@Before
	public void beforeMethod() throws IOException {
			bc=new BaseClass();
			Date d=new Date();
			System.out.println(d);
			bc.Screenshot("before login");
			

	}@Test
	public void test() {
		LoginPage page=new LoginPage();
		WebElement txtUserName = page.getTxtUserName();
		bc.enterText(txtUserName, "Gurusriramesh");
		WebElement txtPassword = page.getTxtPassword();
		bc.enterText(txtPassword, "123456789");
		WebElement btnLogin = page.getBtnLogin();
		bc.btnClick(btnLogin);

	}@After
	public void after() throws IOException {
		Date d=new Date();
		System.out.println(d);
		bc.Screenshot("after login");

	}
}
