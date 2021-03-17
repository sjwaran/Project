package org.search;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	public SearchHotel() {
	PageFactory.initElements(driver, this);
}
	@FindBy(name="location")
	private WebElement location;
	
	@FindBy(xpath="//select[@name='hotels']")
	private WebElement hotels;
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement roomType;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement numberOfRoom;
	
	@FindBy(xpath="//input[@name='datepick_in']")
	private WebElement checkIn;
	
	@FindBy(xpath="//input[@name='datepick_out']")
	private WebElement checkOut;
	
	@FindBy(xpath="//input[@name='Submit']")
	private WebElement search;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement adultsRoom;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement childrensRoom;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberOfRoom() {
		return numberOfRoom;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getAdultsRoom() {
		return adultsRoom;
	}

	public WebElement getChildrensRoom() {
		return childrensRoom;
	}
}
