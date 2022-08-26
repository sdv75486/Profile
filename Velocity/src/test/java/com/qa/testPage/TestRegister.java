package com.qa.testPage;

import org.testng.annotations.Test;

import com.qa.testBasse.TestBase;

public class TestRegister extends TestBase{
	
	@Test
	public void register() {
		reg.verifyRegister();
		reg.verifyName("Shubham");
	}
}
