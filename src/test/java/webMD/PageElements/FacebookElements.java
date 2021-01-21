package webMD.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookElements {
	
	@FindBy(xpath = "//a[@data-metrics-link='tw']")
	public WebElement twitterLink;
	
	@FindBy(xpath = "//a[@data-metrics-link='fb']")
//			"//a[@data-metrics-link='fb']")
	public WebElement facebookLink;
	
	@FindBy(xpath = "//div[@id='u_0_2']")
	public WebElement likeFacebookLink;
	
	@FindBy(xpath = "//a[@data-metrics-link='pt']")
	public WebElement pinterestlink;
	
	@FindBy(xpath="//iframe[@data-testid='fb:page Facebook Social Plugin']")
	public WebElement iFrame;

}
