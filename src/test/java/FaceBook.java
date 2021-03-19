import java.io.IOException;
import java.util.Date;

import org.base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.sam.Fb.Fb;

public class FaceBook extends BaseClass {
	BaseClass bc;

	@BeforeClass
	public static void launchBrowser() {
		getDriver();
		launchUrl("https://www.facebook.com/");

	}

	@Before
	public void beforeMethod() throws IOException {
		bc = new BaseClass();
		Date d = new Date();
		System.out.println(d);
		bc.Screenshot("before login");

	}

	@Test
	public void tc0() throws IOException {
		Fb f = new Fb();

		bc.enterText(f.getTxtUserName(), bc.getDataFromExcel(
				"C:\\Users\\user\\eclipse-workspace\\Maven1\\ExcelRead\\ExcelRead4.xlsx", "Sheet2", 1, 0));
		Assert.assertEquals("sjwaran1088@gmail.com", f.getTxtUserName().getAttribute("value"));
		bc.enterText(f.getTxtPassword(), bc.getDataFromExcel(
				"C:\\Users\\user\\eclipse-workspace\\Maven1\\ExcelRead\\ExcelRead4.xlsx", "Sheet2", 1, 1));
		bc.btnClick(f.getLogin());
	}

	@After
	public void after() throws IOException {
		Date d = new Date();
		System.out.println(d);
		bc.Screenshot("after login");

	}

	@AfterClass
	public static void afterMethod() {
		driver.quit();

	}
}
