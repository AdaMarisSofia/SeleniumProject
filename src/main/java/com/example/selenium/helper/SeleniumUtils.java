package com.example.selenium.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.WebElement;

import java.time.Duration;
//import java.time.Instant;
//import java.time.LocalDate;
import java.util.Map;

public class SeleniumUtils {

	WebDriver webDriver;
	Actions actions;

	WebDriverWait webDriverWait;

	public SeleniumUtils(WebDriver webDriver) {
		this.webDriver = webDriver;
		this.webDriverWait = new WebDriverWait(webDriver, Duration.ofSeconds(10), Duration.ofMillis(500));
	}

	public void clickOnButton(String buttonName, Map<String, By> pageElements) {
		WebElement elementToClick = waitTillByElementVisible(pageElements.get(buttonName), 10, 500);
		elementToClick.click();
	}

	public WebElement waitTillByElementVisible(By id, int sWait, int msPoll) {
		WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(sWait), Duration.ofMillis(msPoll));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(id));
	}

	public void insertText(String inputText, Map<String, By> pageElements) {
		WebElement elementToClick = waitTillByElementVisible(pageElements.get(inputText), 10, 500);
		elementToClick.sendKeys(inputText);
		elementToClick.sendKeys(Keys.ENTER);

	}

	public boolean verifyEmptyField(String fieldName, Map<String, By> pageElements) {
		WebElement fieldElement = waitTillByElementVisible(pageElements.get(fieldName), 10, 500);
		return fieldElement.getText().isEmpty();
	}
}
