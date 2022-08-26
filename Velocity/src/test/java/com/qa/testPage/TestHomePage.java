package com.qa.testPage;

import org.testng.annotations.Test;

import com.qa.testBasse.TestBase;

public class TestHomePage extends TestBase{
	
	@Test
	public void homepage() {
		home.verifySkills("Test Engineer");
		home.verifyYear();
		home.verifyCity("Pune");
		home.verifySearch();
	}
}
