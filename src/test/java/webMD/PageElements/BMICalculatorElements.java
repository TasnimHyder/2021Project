package webMD.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BMICalculatorElements {
	@FindBy(linkText = "BMI Calculator")
	public WebElement BMILink;

	@FindBy(xpath = "//input[@name='heightFeet']")
	public WebElement feet;

	@FindBy(xpath = "//input[@name='heightInches']")
	public WebElement inches;

	@FindBy(xpath = "//input[@name='weight']")
	public WebElement weight;

	@FindBy(xpath = "//button[@scroll-to='bmi-step']")
	public WebElement submitBtn;

	@FindBy(xpath = "//div[@class='bmi-results']")
	public WebElement BMIResult;

	@FindBy(xpath = "//span[contains(@class,'error')]")
	public WebElement BMIError;
}

