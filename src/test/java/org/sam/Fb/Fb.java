package org.sam.Fb;
import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb extends BaseClass {
	public Fb() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "email")
	private WebElement txtUserName;

	@FindBy(name = "pass")
	private WebElement txtPassword;

	@FindBy(name = "login")
	private WebElement login;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getLogin() {
		return login;
	}

}
