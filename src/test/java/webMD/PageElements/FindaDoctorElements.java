package webMD.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FindaDoctorElements {

	@FindBy(id = "webmdHoverClose")
	public WebElement cookie;

	@FindBy(xpath = "//a[@href='//doctor.webmd.com/']")
	public WebElement link;

	@FindBy(id = "searchkeywords_desktop")
	public WebElement firstSearchBar;

	@FindBy(id = "searchlocation_desktop")
	public WebElement secondSearchBar;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement searchBtn;

	@FindBy(xpath = "//span[@class='doctor-count']")
	public WebElement searchResult;

	@FindBy(xpath = "//div[@class='no-results-main-text']")
	public WebElement errorMsg;
}
