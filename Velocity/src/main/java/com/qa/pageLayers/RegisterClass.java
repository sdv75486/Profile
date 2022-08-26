package com.qa.pageLayers;

import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBasse.TestBase;

public class RegisterClass extends TestBase{
	
	public RegisterClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "register_Layer")
	private WebElement register;
	public void verifyRegister() {
		String home = driver.getWindowHandle();
		System.out.println("Id for home page:-"+home);
		register.click();
		Set<String> child = driver.getWindowHandles();
		System.out.println("Register window id :-"+child);
		for(String ch:child) {
			if(!home.equals(ch)) {
				driver.switchTo().window(ch);
			}
		}
	}
	@FindBy(xpath="//input[@id = 'name']")
	private WebElement fullname;
	public void verifyName(String name) {
		fullname.sendKeys(name);
	}
}
