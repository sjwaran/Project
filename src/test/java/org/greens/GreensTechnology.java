package org.greens;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensTechnology extends BaseClass{
	
	public GreensTechnology() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//u[text()='Greens Technologys Software Training Centers in Chennai']")
	private WebElement scollDown;
	
	@FindBy(xpath="//u[text()='Greens Technologys Software Training Centers in Chennai']")
	private WebElement print;

	public WebElement getPrint() {
		return print;
	}

	@FindBy(xpath="//h1[text()='No 1 Software Training Institutes in Chennai with Placements']")
	private WebElement scrollUp ;

	@FindBy(xpath="//a[text()='Certifications']")
	private WebElement certificate ;

	@FindBy(xpath="(//a[text()='Course Content'])[29]")
	private WebElement courseContent;

	@FindBy(xpath="//a[text()='COURSES']")
	private WebElement courses;

	@FindBy(xpath="//span[text()='Java Training']")
	private WebElement java ;
	
	@FindBy(xpath="//span[text()='Core Java Training']")
	private WebElement core;
	
	@FindBy(xpath="//span[text()='Core Java Training']")
	private WebElement click;
 
	public WebElement getClick() {
		return click;
	}

	@FindBy(xpath="//h2[text()='Java training Reviews from Anitha']")
	private WebElement anitha;

	public WebElement getScollDown() {
		return scollDown;
	}

	public WebElement getScrollUp() {
		return scrollUp;
	}

	public WebElement getCertificate() {
		return certificate;
	}

	public WebElement getCourseContent() {
		return courseContent;
	}

	public WebElement getCourses() {
		return courses;
	}

	public WebElement getJava() {
		return java;
	}

	public WebElement getCore() {
		return core;
	}

	public WebElement getAnitha() {
		return anitha;
	}

	
}
