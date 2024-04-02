package com.example.selenium.pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;

public class TextBoxPage implements BasePage {

	public Map<String, By> pageElements = new HashMap<String, By>();
	private By fullNameFiledLocator = By.xpath("//*[@id='userName']");
	private By emailFiledLocator = By.xpath("//*[@id='userEmail']");
	private By currentAddressFiledLocator = By.xpath("//*[@id='currentAddress']");
	private By permanentAddressFiledLocator = By.xpath("//*[@id='permanentAddress']");

	public TextBoxPage() {
		createPageElements();
	}

	private void createPageElements() {
		pageElements.put("Full Name", fullNameFiledLocator);
		pageElements.put("Email", emailFiledLocator);
		pageElements.put("Current Address", currentAddressFiledLocator);
		pageElements.put("Permanent Address", permanentAddressFiledLocator);
	}

	@Override
	public Map<String, By> getElements() {
		return this.pageElements;
	}
}
