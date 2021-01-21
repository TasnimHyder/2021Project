package webMD.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepressionQuizElements {
	@FindBy(linkText = "HEALTH A-Z")
	public WebElement Healthlink;

	@FindBy(linkText = "Depression")
	public WebElement Depressionlink;

	@FindBy(xpath = "//div[@class='module menu-label']")
	public WebElement MenuBtn;

	@FindBy(linkText = "Quizzes")
	public WebElement QuizzesLink;

	@FindBy(className = "article-title")
	public WebElement articleTitle;

	@FindBy(xpath = "//ul[@id='rmq_slides']/li[@data-slide-type='question' and @style[not(contains(., 'display: none'))]]//ul[@class='radio_inputs']//a[@data-selected-answer='a']")
	// ul[@id="rmq_slides"]/li[@data-slide-type="question" and @style[contains(.,
	// "display:
	// list-item")]]//ul[@class="radio_inputs"]//a[@data-selected-answer="a"]//div[@class="input"]
	public WebElement Truelink;

	@FindBy(xpath = "//ul[@id='rmq_slides']/li[@data-slide-type='answer'='slide answer'][1]//a[@class='rmq_next']")
	public WebElement Truelink2;

	@FindBy(xpath = "//ul[@id='rmq_slides']/li[@data-slide-type='answer' and @style[contains(., 'display: list-item')]]/div/div[3]/ul/li/a/span")
//"//ul[@id='rmq_slides']/li[@data-slide-type='answer' and @style[contains(., 'display: list-item')]]//i[@class='icon-arrow-right']")
	public WebElement NextBtn;

	@FindBy(id = "rmq_score_graphiccanvas")
	public WebElement Quizresult;

	@FindBy(xpath = "//*[@id=\"rmq_slides\"]/li[5]/div/div[3]/h2")
	public WebElement Test;
}
