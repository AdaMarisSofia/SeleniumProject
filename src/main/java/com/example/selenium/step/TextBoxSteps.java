package com.example.selenium.step;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.selenium.helper.SeleniumUtils;
import com.example.selenium.pages.TextBoxPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TextBoxSteps {
	public SeleniumUtils seleniumUtils;

	@Autowired
	private final TextBoxPage textBoxPage = new TextBoxPage();

	@Given("I click on the {string} meniu from the ToolsQA page")
	public void clickOnTextBoxMenu(String menuName) {
		seleniumUtils.clickOnButton(menuName, textBoxPage.pageElements);
	}

	@And("I click on the {string} button from the {string} menu")
	public void clickOnTheButtonInElementsMenu(String buttonName, String menuName) {
		seleniumUtils.clickOnButton(buttonName + "" + menuName, textBoxPage.pageElements);
	}

	@And("I click on the {string} section from the {string} menu")
	public void clickOnTheMenu(String sectionName, String menuName) {
		seleniumUtils.clickOnButton(sectionName + "" + menuName, textBoxPage.pageElements);
	}

	@When("I enter {string} in the {string} field")
	public void insertValueInTextFieldInKDMTab(String fieldValue, String fieldName) {
		seleniumUtils.insertText(fieldValue + " " + fieldName, textBoxPage.pageElements);
	}

	@And("I enter {string} in the {string} field")
	public void insertValueInTextFieldInTextBoxMenu(String fieldValue, String fieldName) {
		seleniumUtils.insertText(fieldValue + " " + fieldName, textBoxPage.pageElements);
	}

	@And("I enter {string} in the {string} field")
	public void enterValueInTextField(String value, String field) {
		seleniumUtils.insertText(value + " " + field, textBoxPage.pageElements);
	}

	@And("I enter {string} in the {string} field")
	public void insertValueInTextFieldInTextBoxDialog(String fieldValue, String fieldName) {
		seleniumUtils.insertText(fieldValue + " " + fieldName, textBoxPage.pageElements);
	}

	@Then("I click on {string} button in Text box dialog")
	public void clickOnTheButtonInTextBoxDialog(String buttonName) {
		seleniumUtils.clickOnButton(buttonName, textBoxPage.pageElements);
	}

	@And("I should see the new data in all the fields")
	public void allNewDataIsDisplayedInTextBoxDialog() {
		
	}

}
