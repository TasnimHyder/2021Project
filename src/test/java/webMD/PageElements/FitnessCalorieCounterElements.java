package webMD.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FitnessCalorieCounterElements {

	@FindBy(linkText = "Fitness Calorie Counter")
	public WebElement FitnessCalorielink;

	@FindBy(xpath = "//input[@id='search-form']")
	public WebElement searchExercise;

	@FindBy(xpath = "//div[@class='results-area ng-scope']/div/ul/li[1]/a/h4")
	public WebElement ClickFirstExercise;

	@FindBy(xpath = "//a[contains(text(), 'Bicycling')]")
	public WebElement BicyclingLink;

	@FindBy(linkText = "bicycling, BMX")
	public WebElement BMX;

	@FindBy(xpath = "//a[contains(text(), 'Dancing')]")
	public WebElement DancingLink;

	@FindBy(linkText = "dancing, general")
	public WebElement GenDancing;

	@FindBy(xpath = "//input[@id='your-weight']")
	public WebElement Weight;

	@FindBy(xpath = "//input[@id='duration-hours']")
	public WebElement Hours;

	@FindBy(xpath = "//input[@id='duration-min']")
	public WebElement Minutes;

	@FindBy(xpath = "//button[contains(text(), 'Calculate')]")
	public WebElement CalculateBtn;

	@FindBy(xpath = "//div[@data-ng-if='vm.app.calculateResultsAreaVisible']")
	public WebElement CalorieBurned;

}
