package webMD.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpElements {


	@FindBy(xpath = "//a[contains(text(),'Sign In')]")
	public WebElement signinLink;
	
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[3]/div[1]/span[1]/a[2]")
	public WebElement signupLink;
	
	@FindBy(xpath = "//*[@id=\"signupForm\"]/div/div/div[2]/div[1]/form/fieldset/div[1]/div[1]/input")
	public WebElement email;
	
	
	@FindBy(xpath = "//*[@id=\"signupForm\"]/div/div/div[2]/div[1]/form/fieldset/div[2]/div[1]/input")
	public WebElement pass;
	
	
	@FindBy(className="reg-datepicker")
	public WebElement dateOfBirth;
	
	@FindBy(xpath = "//*[@id=\"signupForm\"]/div/div/div[2]/div[1]/form/fieldset/div[7]/span[1]/input")
	public WebElement signupButton;
	
	
	@FindBy(id = "webmdHoverClose")
	public WebElement cookiesIcon;
	
	
	
	@FindBy(xpath = "//a[contains(text(),'My Profile')]")
	public WebElement signinText;
	
	
	
	
}

	
