package org.junit;

import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;
import org.login.LoginPage;
import org.openqa.selenium.WebElement;
import org.sam.Fb.Fb;

public class Junit2 extends BaseClass {
	BaseClass bc;
	@BeforeClass
	public static void browserLaunch() {
		
		getDriver();
		launchUrl("https://www.facebook.com/");

	}@Before
	public void beforeMethod() throws IOException {
			bc=new BaseClass();
			Date d=new Date();
			System.out.println(d);
			bc.Screenshot("before login1");
			

	}@Test
	public void tc0() {
		Fb fb = new Fb();
		bc.enterText(fb.getTxtUserName(), "sjwaran1088@gmail.com");
		bc.enterText(fb.getTxtPassword(), "rithanesh");

	}
		
		

	
@After
	public void after() throws IOException {
		Date d=new Date();
		System.out.println(d);
		bc.Screenshot("after login1");

	}
}
