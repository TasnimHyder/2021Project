package webMD.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuestionsAndAnswersElements {
	
	@FindBy(linkText = "HEALTH A-Z")
	public WebElement Healthlink;

	@FindBy (xpath = "//a[@href='https://www.webmd.com/a-to-z-guides/qa']")
	public WebElement QuestionsAnswersLink;
	
	@FindBy (linkText = "Questions")
	public WebElement QAPageLink;
	
	@FindBy (xpath = "//a[@href='/mental-health/eating-disorders/qa/default.htm']")
	public WebElement EatingDisordersBtn;
	
	@FindBy (xpath = "//*[@id=\"ContentPane31\"]/div/div[2]/ul/li[4]/a")
	public WebElement DisordersQuestionBtn;
	
	
}
