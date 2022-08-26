package com.qa.pageLayers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.testBasse.TestBase;

public class HomePage extends TestBase{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//input[@class='suggestor-input '])[1]")
	private WebElement enterskill;
	public void verifySkills(String skill) {
		enterskill.sendKeys(skill);
	}
	@FindBy(id = "expereinceDD")
	private WebElement exp;
	@FindBy(xpath = "(//ul[@class='dropdown ']/li)[3]")
	private WebElement year;
	public void verifyYear() {
		exp.click();
		year.click();
		
	}
	
	@FindBy(xpath = "(//input[@class='suggestor-input '])[2]")
	private WebElement city;
	public void verifyCity(String name) {
		city.sendKeys(name);
	}
	@FindBy(xpath = "//div[@class='qsbSubmit']")
	private WebElement search;
	public void verifySearch() {
		search.click();
	}
	
}
